package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ON implements OI<int[]> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.OI
    public java.lang.String EZpvd() {
        return "IntegerArrayPool";
    }

    @Override // o.OI
    public int KWHzl() {
        return 4;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)I */
    @Override // o.OI
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public int AEQbTJ(int[] iArr) {
        return iArr.length;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(I)Ljava/lang/Object; */
    @Override // o.OI
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public int[] copydefault(int i) {
        return new int[i];
    }
}
