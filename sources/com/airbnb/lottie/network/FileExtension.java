package com.airbnb.lottie.network;

/* JADX INFO: loaded from: classes2.dex */
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");

    public final String extension;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }

    FileExtension(String str) {
        this.extension = str;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }
}
