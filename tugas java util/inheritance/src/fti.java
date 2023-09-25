class fti
{
    String prodi;

    public fti(String prodi) {
        this.prodi = prodi;
    }

    public void nim() {
        System.out.println("Memiliki NIM berbeda.");
    }
}

    class Tekinfor extends fti
    {
        public Tekinfor(String prodi)
        {
            super(prodi);
        }

        public void nim()
        {
            super.nim();
            System.out.println(prodi + "Memiliki NIM 535.");
        }
    }
    class Sisfor extends fti
    {
        public Sisfor(String prodi)
        {
            super(prodi);
        }

        @Override
        public void nim()
        {
            super.nim();
            System.out.println(prodi + "Memiliki NIM 825.");
        }
    }