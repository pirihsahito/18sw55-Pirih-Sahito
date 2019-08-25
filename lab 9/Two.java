class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
class VotingMachine
{
    String []names;
    int votes[];
    public void addStudents(String names[])
    {
        this.names=names;
        votes = new int[names.length];
    }
    public void castVote(int voterAge,String votesToCandidate) throws InvalidAgeException
        {
            if(voterAge<18)
            {
                throw new InvalidAgeException("Candidate can't be under 18");
            }
            else
            {
                for(int i=0;i<names.length;i++)
                {
                    if(names[i]==votesToCandidate)
                    {
                        votes[i]++;
                    }
                }
            }
            
            
    }
    public void printResults()
    {
        for(int j=0;j<names.length;j++)
        {
            System.out.println(names[j]+" have got "+votes[j]+" votes");
        }
    }
    public static void main(String[]nah)
    {
        String []candidates={"Pirih","Farhana","Durdana","Hittler","Maha"};
        VotingMachine machine = new VotingMachine();
        try
        {
            machine.addStudents(candidates);
            machine.castVote(18,"Farhana");
            machine.castVote(18, "Pirih");
            machine.castVote(18,"Durdana");
            machine.printResults();
            machine.castVote(14,"Hittler");
        }
        catch(InvalidAgeException x)
        {
            System.out.println(x);
        }
        
    }
}
