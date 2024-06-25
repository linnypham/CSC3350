public class    Context {
    private ISort sorter;
    public Context(ISort sorter)
    {
        // We pass to the context the strategy to use
        this.sorter = sorter;
    }
        public ISort Sorter
    {
        get(return sorter;)
    }
}
