package o;

import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.auO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C7995auO {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CAST (int) (wrap:long:0x0009: ARITH (wrap:long:0x0006: ARITH (wrap:long:0x0000: CAST (long) (r4v0 int)) & (wrap:long:SGET  A[WRAPPED] org.spongycastle.asn1.cmc.BodyPartID.bodyIdMax long) A[WRAPPED]) % (wrap:long:0x0008: ARITH (wrap:long:0x0007: CAST (long) (r5v0 int)) & (wrap:long:SGET  A[WRAPPED] org.spongycastle.asn1.cmc.BodyPartID.bodyIdMax long) A[WRAPPED]) A[WRAPPED]) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ int OLrzqt(int i, int i2) {
        return (int) ((((long) i) & BodyPartID.bodyIdMax) % (((long) i2) & BodyPartID.bodyIdMax));
    }
}
