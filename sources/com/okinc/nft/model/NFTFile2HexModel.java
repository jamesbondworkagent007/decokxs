package com.okinc.nft.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class NFTFile2HexModel {
    public static final int $stable = 0;
    private final String base64;
    private final String fileName;
    private final String filePath;
    private final long fileSize;
    private final String hex;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NFTFile2HexModel copy$default(NFTFile2HexModel nFTFile2HexModel, String str, String str2, String str3, long j, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nFTFile2HexModel.base64;
        }
        if ((i & 2) != 0) {
            str2 = nFTFile2HexModel.fileName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = nFTFile2HexModel.filePath;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            j = nFTFile2HexModel.fileSize;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str4 = nFTFile2HexModel.hex;
        }
        return nFTFile2HexModel.copy(str, str5, str6, j2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.base64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.hex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NFTFile2HexModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new NFTFile2HexModel(str, str2, str3, j, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NFTFile2HexModel)) {
            return false;
        }
        NFTFile2HexModel nFTFile2HexModel = (NFTFile2HexModel) obj;
        return Intrinsics.EZpvd((Object) this.base64, (Object) nFTFile2HexModel.base64) && Intrinsics.EZpvd((Object) this.fileName, (Object) nFTFile2HexModel.fileName) && Intrinsics.EZpvd((Object) this.filePath, (Object) nFTFile2HexModel.filePath) && this.fileSize == nFTFile2HexModel.fileSize && Intrinsics.EZpvd((Object) this.hex, (Object) nFTFile2HexModel.hex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBase64() {
        return this.base64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHex() {
        return this.hex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.base64.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.filePath.hashCode()) * 31) + Long.hashCode(this.fileSize)) * 31) + this.hex.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NFTFile2HexModel(base64=" + this.base64 + ", fileName=" + this.fileName + ", filePath=" + this.filePath + ", fileSize=" + this.fileSize + ", hex=" + this.hex + ")";
    }

    public NFTFile2HexModel(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.base64 = str;
        this.fileName = str2;
        this.filePath = str3;
        this.fileSize = j;
        this.hex = str4;
    }
}
