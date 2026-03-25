package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.beE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9892beE extends AbstractC33073mpa {
    public final MutableLiveData<C10594brR> AEQbTJ;
    public final MutableLiveData<java.lang.String> EZpvd;
    public final C12827cuN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C9892beE() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C10594brR> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0007: INVOKE 
  (wrap:o.cuN$Application:0x0004: SGET  A[WRAPPED] (LINE:13) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:13)) : (r1v0 o.cuN))
 A[MD:(o.cuN):void (m)] (LINE:12) call: o.beE.<init>(o.cuN):void type: THIS */
    public /* synthetic */ C9892beE(C12827cuN c12827cuN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN);
    }

    public C9892beE(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.copydefault = c12827cuN;
        this.AEQbTJ = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
    }

    public static final InterfaceC58261yxu copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final void EZpvd(@NotNull java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.copydefault.OLrzqt(str, true);
        final Function1 function1 = new Function1() { // from class: o.beH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9892beE.EZpvd(j, this, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.beJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9892beE.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtOLrzqt2);
        final Function1 function12 = new Function1() { // from class: o.beM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9892beE.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.beI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C9892beE.OLrzqt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.beK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9892beE.copydefault((java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.beL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C9892beE.AYXKKw(function13, obj);
            }
        }));
    }

    public static final InterfaceC58261yxu EZpvd(long j, C9892beE c9892beE, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strIsConnected;
        CustomChainCoinMeta customChainCoinMetaFetchVPNInfo;
        CustomChainCoinMeta customChainCoinMetaFetchVPNInfo2;
        CustomChainMeta customChainMetaOLrzqt;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C10594brR c10594brRFJNWhG = abstractC12782ctV.fJNWhG(j);
        pUU.copydefault("fcj customChainWalletCoinAsset " + c10594brRFJNWhG + " " + ((c10594brRFJNWhG == null || (customChainCoinMetaFetchVPNInfo2 = c10594brRFJNWhG.fetchVPNInfo()) == null || (customChainMetaOLrzqt = customChainCoinMetaFetchVPNInfo2.OLrzqt()) == null) ? null : customChainMetaOLrzqt.isConnected()) + "  " + ((c10594brRFJNWhG == null || (customChainCoinMetaFetchVPNInfo = c10594brRFJNWhG.fetchVPNInfo()) == null) ? null : customChainCoinMetaFetchVPNInfo.djBIcL()));
        c9892beE.AEQbTJ.postValue(c10594brRFJNWhG);
        if (c10594brRFJNWhG == null) {
            return null;
        }
        C10734btz c10734btz = C10734btz.KWHzl;
        CustomChainMeta customChainMetaOLrzqt2 = c10594brRFJNWhG.fetchVPNInfo().OLrzqt();
        if (customChainMetaOLrzqt2 != null && (strIsConnected = customChainMetaOLrzqt2.isConnected()) != null) {
            str = strIsConnected;
        }
        return c10734btz.valueOf(str, c10594brRFJNWhG.fetchVPNInfo().djBIcL());
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C9892beE c9892beE, java.lang.String str) {
        C10854bwM c10854bwMKWHzl;
        MutableLiveData<java.lang.String> mutableLiveData = c9892beE.EZpvd;
        Intrinsics.copydefault((java.lang.Object) str);
        C10594brR value = c9892beE.AEQbTJ.getValue();
        mutableLiveData.setValue(C54870xYj.AEQbTJ(str, (value == null || (c10854bwMKWHzl = value.KWHzl()) == null) ? 0 : c10854bwMKWHzl.valueOf()));
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        pUU.AEQbTJ("getCoinInfo error " + th);
        return Unit.INSTANCE;
    }
}
