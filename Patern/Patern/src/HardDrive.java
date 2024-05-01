class HardDrive {
    public byte[] read(long lba, int size) { 
        System.out.println("HardDrive read from position: " + lba);
        return new byte[]{0};
    }
}
