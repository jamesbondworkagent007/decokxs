package o;

import com.okinc.business.defi.share.bean.Web3ShareType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dTv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13667dTv {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.dTv$ActionBar */
    public static final class ActionBar {

        /* JADX INFO: renamed from: o.dTv$ActionBar$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[Web3ShareType.values().length];
                try {
                    iArr[Web3ShareType.SHARE_IMAGE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[Web3ShareType.SHARE_WEBPAGE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[Web3ShareType.SHARE_CUSTOMIZE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dTv.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final AbstractC13657dTl AEQbTJ(@NotNull Web3ShareType web3ShareType) {
            Intrinsics.checkNotNullParameter(web3ShareType, "");
            int i = StateListAnimator.EZpvd[web3ShareType.ordinal()];
            if (i == 1) {
                return new C13665dTt();
            }
            if (i == 2) {
                return new dTF();
            }
            if (i == 3) {
                return new C13654dTi(null, 1, null);
            }
            pUU.copydefault("Unsupported share type: " + web3ShareType);
            return null;
        }
    }
}
