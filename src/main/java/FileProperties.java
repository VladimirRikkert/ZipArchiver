public class FileProperties {
    private final String name;
    private final long size;
    private final long compressedSize;

    public FileProperties(String name, long size, long compressedSize) {
        this.name = name;
        this.size = size;
        this.compressedSize = compressedSize;
    }

    public long getCompressionRatio() {
        // Вычисляем степень сжатия
        return 100 - ((compressedSize * 100) / size);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        if (size > 0) {
            builder.append("\t");
            builder.append(size / 1024);
            builder.append(" Kb (");
            builder.append(compressedSize / 1024);
            builder.append(" Kb) сжатие: ");
            builder.append(getCompressionRatio());
            builder.append("%");
        }

        return builder.toString();
    }
}