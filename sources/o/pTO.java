package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class pTO implements pTQ {
    public static final ActionBar Companion = new ActionBar(null);

    @yCM
    public pTO() {
    }

    @Override // o.pTQ
    public java.lang.String EZpvd() {
        if (!oJV.AEQbTJ.fJNWhG() || C43292rmY.OLrzqt.AwvSrB().values()) {
            return null;
        }
        java.lang.String strAYXKKw = C38303pTu.AYXKKw(C38301pTs.OLrzqt.copydefault());
        pUU.KWHzl("LocalizeFeaturesService", "getSystemLocaleIfNecessaryForFallback, systemLocaleString:" + strAYXKKw);
        return strAYXKKw;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pTO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
