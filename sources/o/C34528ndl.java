package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.filter.ui.TypeOptionParams;
import com.okinc.dexkline.market.features.position.ui.transaction_filter.TransactionFilterSheetParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C34658ngJ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ndl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34528ndl extends AbstractC34521nde {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public C36062oNw AYXKKw;
    public RecyclerView.ItemDecoration AhwBna;
    public final java.util.List<C34600nfE> djBIcL = new java.util.ArrayList();
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ndi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34528ndl.AEQbTJ(this.copydefault);
        }
    });

    /* JADX INFO: renamed from: o.ndl$ActionBar */
    public static final class ActionBar extends GridLayoutManager.SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return (i == 0 || i == 1 || i == 2) ? 2 : 3;
        }
    }

    /* JADX DEBUG: Possible override for method o.nde.KWHzl()V */
    public final TransactionFilterSheetParams KWHzl() {
        TransactionFilterSheetParams transactionFilterSheetParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (transactionFilterSheetParams = (TransactionFilterSheetParams) BundleCompat.getParcelable(arguments, "key.TransactionFilterSheetParams", TransactionFilterSheetParams.class)) == null) ? TransactionFilterSheetParams.Companion.copydefault() : transactionFilterSheetParams;
    }

    private final C34632nfk gEmmrt() {
        return (C34632nfk) this.gEmmrt.getValue();
    }

    public static final C34632nfk AEQbTJ(final C34528ndl c34528ndl) {
        C34647nfz c34647nfz = new C34647nfz(new Function1() { // from class: o.ndh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34528ndl.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        });
        C34632nfk c34632nfk = new C34632nfk();
        c34632nfk.register(C34600nfE.class, c34647nfz);
        return c34632nfk;
    }

    public static final Unit OLrzqt(C34528ndl c34528ndl, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c34528ndl.KWHzl(str, c34528ndl.djBIcL);
        c34528ndl.OLrzqt(str);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        if (KWHzl().copydefault().length() == 0) {
            return;
        }
        wxq.AYXKKw().setText(KWHzl().copydefault());
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
        wxq.EZpvd().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = C36062oNw.copydefault(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        AYXKKw();
        TokenFilter tokenFilterKWHzl = KWHzl().KWHzl();
        java.lang.String strIsConnected = tokenFilterKWHzl != null ? tokenFilterKWHzl.isConnected() : null;
        AEQbTJ(strIsConnected != null ? strIsConnected : "");
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AhwBna();
    }

    private final void AYXKKw() {
        C36062oNw c36062oNw = this.AYXKKw;
        if (c36062oNw != null) {
            c36062oNw.KWHzl.setAdapter(gEmmrt());
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6);
            gridLayoutManager.setSpanSizeLookup(new ActionBar());
            RecyclerView recyclerView = c36062oNw.KWHzl;
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setItemAnimator(null);
            RecyclerView.ItemDecoration itemDecoration = this.AhwBna;
            if (itemDecoration != null) {
                recyclerView.removeItemDecoration(itemDecoration);
            }
            RecyclerView.ItemDecoration itemDecorationAEQbTJ = C33047mpA.AEQbTJ(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            this.AhwBna = itemDecorationAEQbTJ;
            if (itemDecorationAEQbTJ != null) {
                recyclerView.addItemDecoration(itemDecorationAEQbTJ);
            }
        }
    }

    private final void AEQbTJ(java.lang.String str) {
        java.util.List<TypeOptionParams> listOLrzqt = KWHzl().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (TypeOptionParams typeOptionParams : listOLrzqt) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.zuBGHE);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) typeOptionParams.EZpvd());
            spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
            arrayList.add(new C34600nfE(typeOptionParams.AEQbTJ(), null, new android.text.SpannedString(spannableStringBuilder), false, 10, null));
        }
        KWHzl(str, arrayList);
    }

    private final void OLrzqt(java.lang.String str) {
        TokenFilter tokenFilterAEQbTJ;
        java.lang.Object next;
        InterfaceC32365mZh interfaceC32365mZh;
        TokenFilter tokenFilterKWHzl = KWHzl().KWHzl();
        if (tokenFilterKWHzl == null || (tokenFilterAEQbTJ = tokenFilterKWHzl.AEQbTJ((15359 & 1) != 0 ? tokenFilterKWHzl.copydefault : null, (15359 & 2) != 0 ? tokenFilterKWHzl.isConnected : null, (15359 & 4) != 0 ? tokenFilterKWHzl.DbNXlk : str, (15359 & 8) != 0 ? tokenFilterKWHzl.AhwBna : null, (15359 & 16) != 0 ? tokenFilterKWHzl.AEQbTJ : null, (15359 & 32) != 0 ? tokenFilterKWHzl.valueOf : false, (15359 & 64) != 0 ? tokenFilterKWHzl.djBIcL : false, (15359 & 128) != 0 ? tokenFilterKWHzl.EZpvd : null, (15359 & 256) != 0 ? tokenFilterKWHzl.AYXKKw : false, (15359 & 512) != 0 ? tokenFilterKWHzl.OLrzqt : false, (15359 & 1024) != 0 ? tokenFilterKWHzl.gEmmrt : null, (15359 & 2048) != 0 ? tokenFilterKWHzl.fetchVPNInfo : null, (15359 & 4096) != 0 ? tokenFilterKWHzl.KWHzl : null, (15359 & 8192) != 0 ? tokenFilterKWHzl.AkhnZx : null)) == null) {
            return;
        }
        dismissAllowingStateLoss();
        C34658ngJ c34658ngJ = C34658ngJ.copydefault;
        java.util.Iterator it = C59405zgS.EZpvd(getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C34658ngJ.StateListAnimator.EZpvd)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof InterfaceC32365mZh) {
                    break;
                }
            }
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
        if (fragment == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            interfaceC32365mZh = (InterfaceC32365mZh) (fragmentActivityRequireActivity instanceof InterfaceC32365mZh ? fragmentActivityRequireActivity : null);
        } else {
            interfaceC32365mZh = (InterfaceC32365mZh) (fragment instanceof InterfaceC32365mZh ? fragment : null);
        }
        if (interfaceC32365mZh != null) {
            interfaceC32365mZh.OLrzqt(tokenFilterAEQbTJ);
        }
    }

    private final void AhwBna() {
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("DEXMarket_Token_Position_Filter_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ndk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34528ndl.OLrzqt(this.AEQbTJ, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(C34528ndl c34528ndl, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", c34528ndl.KWHzl().AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ndl$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ndl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C34528ndl OLrzqt(@NotNull TransactionFilterSheetParams transactionFilterSheetParams) {
            Intrinsics.checkNotNullParameter(transactionFilterSheetParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.TransactionFilterSheetParams", transactionFilterSheetParams);
            C34528ndl c34528ndl = new C34528ndl();
            c34528ndl.setArguments(bundle);
            return c34528ndl;
        }
    }

    public final void KWHzl(java.lang.String str, java.util.List<C34600nfE> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C34600nfE c34600nfE : list) {
            arrayList.add(C34600nfE.copy$default(c34600nfE, null, null, null, Intrinsics.EZpvd((java.lang.Object) c34600nfE.OLrzqt(), (java.lang.Object) str), 7, null));
        }
        this.djBIcL.clear();
        this.djBIcL.addAll(arrayList);
        C34632nfk.setData$default(gEmmrt(), arrayList, null, 2, null);
    }
}
