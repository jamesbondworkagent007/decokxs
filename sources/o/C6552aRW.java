package o;

import com.okinc.auth.impl.passkey.utils.GoogleServiceAvailabilityHelperModule;

/* JADX INFO: renamed from: o.aRW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6552aRW implements InterfaceC58162ywA<C6609aSa> {
    public final InterfaceC58164ywC<android.content.Context> KWHzl;
    public final GoogleServiceAvailabilityHelperModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C6609aSa get() {
        return EZpvd(this.copydefault, this.KWHzl.get());
    }

    public static C6609aSa EZpvd(GoogleServiceAvailabilityHelperModule googleServiceAvailabilityHelperModule, android.content.Context context) {
        return (C6609aSa) C58165ywD.KWHzl(googleServiceAvailabilityHelperModule.copydefault(context));
    }
}
