package o;

/* JADX INFO: loaded from: classes2.dex */
public final class OK implements OI<byte[]> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.OI
    public java.lang.String EZpvd() {
        return "ByteArrayPool";
    }

    @Override // o.OI
    public int KWHzl() {
        return 1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)I */
    @Override // o.OI
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public int AEQbTJ(byte[] bArr) {
        return bArr.length;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(I)Ljava/lang/Object; */
    @Override // o.OI
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public byte[] copydefault(int i) {
        return new byte[i];
    }
}
