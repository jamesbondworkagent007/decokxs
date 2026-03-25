package com.sparrowwallet.hummingbird;

/* JADX INFO: loaded from: classes24.dex */
public class BC32DecoderException extends IllegalArgumentException {
    public BC32DecoderException(String str) {
        super(str);
    }

    public static class InvalidCharacter extends BC32DecoderException {
        public final char character;
        public final int position;

        public InvalidCharacter(char c, int i) {
            super("Invalid character '" + c + "' at position " + i);
            this.character = c;
            this.position = i;
        }
    }

    public static class InvalidDataLength extends BC32DecoderException {
        public InvalidDataLength(String str) {
            super(str);
        }
    }

    public static class InvalidChecksum extends BC32DecoderException {
        public InvalidChecksum() {
            super("Checksum does not validate");
        }
    }
}
