package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.immomo.mls.InitData;
import com.okinc.nft.nftmarket.NFTBridge;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43471rps;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rrW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43555rrW extends AbstractC43061riF implements InterfaceC54854xXu, InterfaceC54847xXn {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public C43432rpF AEQbTJ;
    public InterfaceC58217yxC AhwBna;
    public float OLrzqt;
    public long KWHzl = -1;
    public long AYXKKw = -1;
    public java.lang.String gEmmrt = "";
    public final int copydefault = C43471rps.TaskDescription.OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "NFTAssetsHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        C43432rpF c43432rpF = this.AEQbTJ;
        android.widget.FrameLayout frameLayout = c43432rpF != null ? c43432rpF.EZpvd : null;
        Intrinsics.copydefault(frameLayout);
        return frameLayout;
    }

    /* JADX INFO: renamed from: o.rrW$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rrW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C43555rrW KWHzl(java.lang.String str) {
            C43555rrW c43555rrW = new C43555rrW();
            c43555rrW.AEQbTJ(str);
            return c43555rrW;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("changedWallet");
        final Function1 function1 = new Function1() { // from class: o.rrX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43555rrW.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        this.AhwBna = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rrV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43555rrW.AEQbTJ(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C43555rrW c43555rrW, java.lang.String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("canRefreshAll", java.lang.Boolean.TRUE);
        c43555rrW.OLrzqt("RefreshNftPersonalAfterWalletChanged", linkedHashMap);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C43432rpF c43432rpFCopydefault = C43432rpF.copydefault(getLayoutInflater(), viewGroup, false);
        this.AEQbTJ = c43432rpFCopydefault;
        if (c43432rpFCopydefault != null) {
            return c43432rpFCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        MutableLiveData<java.lang.Boolean> mutableLiveDataAkhnZx = ((InterfaceC9851bdQ) C43251rlk.copydefault(InterfaceC9851bdQ.class)).AkhnZx();
        if (mutableLiveDataAkhnZx != null) {
            mutableLiveDataAkhnZx.observe(this, new Observer() { // from class: o.rrY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(java.lang.Object obj) {
                    C43555rrW.AEQbTJ((java.lang.Boolean) obj);
                }
            });
        }
    }

    public static final void AEQbTJ(java.lang.Boolean bool) {
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("showTotalAsset", bool);
            interfaceC7298ahGKWHzl.AEQbTJ("showOrHideTotalAsset", null, linkedHashMap);
        }
    }

    @Override // o.AbstractC43061riF, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        NFTBridge.OLrzqt();
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        NFTBridge.sContainer = null;
        java.lang.String str = this.gEmmrt;
        if (str != null && str.length() == 0) {
            NFTBridge.KWHzl();
        } else {
            NFTBridge.KWHzl(this.gEmmrt);
        }
        KWHzl();
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        C43056riA c43056riA = C43056riA.AEQbTJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.String str = this.gEmmrt;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("searchAddress", str);
        Unit unit = Unit.INSTANCE;
        return c43056riA.EZpvd("okluanft", "/dashboard", linkedHashMap);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33016moW
    public boolean onRefresh(@NotNull java.lang.Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (bool != null && bool.booleanValue()) {
            AEQbTJ(false);
        }
        return super.onRefresh(obj, interfaceC33014moU);
    }

    private final void AEQbTJ(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("canRefresh", java.lang.Boolean.TRUE);
        linkedHashMap.put("allRefresh", java.lang.Boolean.valueOf(z));
        OLrzqt("AssetNFTRefresh", linkedHashMap);
    }

    @Override // o.AbstractC43061riF
    public java.util.HashMap<java.lang.String, java.lang.Object> AEQbTJ() {
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(this.KWHzl)), C56390yDp.OLrzqt("progress", java.lang.Float.valueOf(this.OLrzqt)), C56390yDp.OLrzqt("appearance", "alternativeweb3"));
    }

    @Override // o.InterfaceC54854xXu
    public void KWHzl(float f, int i) {
        this.OLrzqt = f;
        NFTBridge.EZpvd(f);
    }

    @Override // o.InterfaceC54847xXn
    public void KWHzl(long j, long j2, boolean z) {
        if (this.KWHzl != j2) {
            this.KWHzl = j2;
            this.AYXKKw = j2;
            KWHzl(j2);
        }
    }

    public final void KWHzl(long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("chainId", java.lang.Long.valueOf(j));
        OLrzqt("eventChainIdChanged", linkedHashMap);
    }

    private final void OLrzqt(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (!android.text.TextUtils.isEmpty(this.gEmmrt)) {
            linkedHashMap.put("guestMode", "yes");
        }
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ(str, null, linkedHashMap);
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        this.gEmmrt = str;
        NFTBridge.EZpvd(str);
    }

    public final void KWHzl() {
        this.gEmmrt = "";
        NFTBridge.EZpvd("");
    }
}
