package org.example.media.library;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        System.out.println("CodecFactory: extracting ogg file...");
        return new OggCompressionCodec();
    }
}
