package com.okinc.business.defi.wallet.transaction.ui.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.wallet.transaction.ui.common.OKWBTCAssetTipFragment;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC16513elO;
import o.C56390yDp;
import o.C56402yEa;
import o.C56444yFp;
import o.C57422yiC;
import o.C57468yiw;
import o.C57508yjj;
import o.C57512yjn;
import o.InterfaceC56445yFq;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class OKWBTCAssetTipFragment extends Fragment {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public List<C57512yjn.ActionBar> AEQbTJ;
    public Function0<Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public AbstractC16513elO OLrzqt;
    public TransactionHeaderInfoBean valueOf;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.HEADER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Style.ASSET_GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Style {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style HEADER_INFO = new Style("HEADER_INFO", 0);
        public static final Style ASSET_GROUP = new Style("ASSET_GROUP", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Style[] $values() {
            return new Style[]{HEADER_INFO, ASSET_GROUP};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Style> getEntries() {
            return $ENTRIES;
        }

        private Style(String str, int i) {
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(styleArr$values);
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transaction.ui.common.OKWBTCAssetTipFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final OKWBTCAssetTipFragment KWHzl(@NotNull String str, @NotNull String str2, @NotNull TransactionHeaderInfoBean transactionHeaderInfoBean, @NotNull String str3, @NotNull String str4, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(transactionHeaderInfoBean, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            OKWBTCAssetTipFragment oKWBTCAssetTipFragment = new OKWBTCAssetTipFragment();
            oKWBTCAssetTipFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("title", str), C56390yDp.OLrzqt("sub_title", str2), C56390yDp.OLrzqt("primary_button_content", str3), C56390yDp.OLrzqt("secondary_button_content", str4), C56390yDp.OLrzqt(TtmlNode.TAG_STYLE, "HEADER_INFO")));
            oKWBTCAssetTipFragment.EZpvd = function0;
            oKWBTCAssetTipFragment.KWHzl = function02;
            oKWBTCAssetTipFragment.valueOf = transactionHeaderInfoBean;
            return oKWBTCAssetTipFragment;
        }

        public final OKWBTCAssetTipFragment KWHzl(@NotNull String str, @NotNull String str2, @NotNull List<C57512yjn.ActionBar> list, @NotNull String str3, @NotNull String str4, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            OKWBTCAssetTipFragment oKWBTCAssetTipFragment = new OKWBTCAssetTipFragment();
            oKWBTCAssetTipFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("title", str), C56390yDp.OLrzqt("sub_title", str2), C56390yDp.OLrzqt("primary_button_content", str3), C56390yDp.OLrzqt("secondary_button_content", str4), C56390yDp.OLrzqt(TtmlNode.TAG_STYLE, "ASSET_GROUP")));
            oKWBTCAssetTipFragment.EZpvd = function0;
            oKWBTCAssetTipFragment.KWHzl = function02;
            oKWBTCAssetTipFragment.AEQbTJ = list;
            return oKWBTCAssetTipFragment;
        }
    }

    public final Style copydefault() {
        String string;
        Style styleValueOf;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString(TtmlNode.TAG_STYLE)) == null || (styleValueOf = Style.valueOf(string)) == null) ? Style.HEADER_INFO : styleValueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16513elO abstractC16513elOCopydefault = AbstractC16513elO.copydefault(layoutInflater, viewGroup, false);
        this.OLrzqt = abstractC16513elOCopydefault;
        if (abstractC16513elOCopydefault != null) {
            return abstractC16513elOCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        gEmmrt();
        EZpvd();
        OLrzqt();
        view.post(new Runnable() { // from class: o.gbL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OKWBTCAssetTipFragment.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(OKWBTCAssetTipFragment oKWBTCAssetTipFragment) {
        rVN.reportFullyDrawn$default((Fragment) oKWBTCAssetTipFragment, true, (String) null, 2, (Object) null);
    }

    public final void gEmmrt() {
        TextView textView;
        TextView textView2;
        AbstractC16513elO abstractC16513elO = this.OLrzqt;
        if (abstractC16513elO != null && (textView2 = abstractC16513elO.valueOf) != null) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("title") : null;
            if (string == null) {
                string = "";
            }
            textView2.setText(string);
        }
        AbstractC16513elO abstractC16513elO2 = this.OLrzqt;
        if (abstractC16513elO2 == null || (textView = abstractC16513elO2.AhwBna) == null) {
            return;
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("sub_title") : null;
        textView.setText(string2 != null ? string2 : "");
    }

    public final void EZpvd() {
        int i = ActionBar.KWHzl[copydefault().ordinal()];
        if (i == 1) {
            KWHzl();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ();
        }
    }

    public final void KWHzl() {
        C57422yiC c57422yiC;
        View view;
        C57422yiC c57422yiC2;
        C57422yiC c57422yiC3;
        View view2;
        C57508yjj c57508yjj;
        AbstractC16513elO abstractC16513elO = this.OLrzqt;
        if (abstractC16513elO != null && (c57508yjj = abstractC16513elO.OLrzqt) != null) {
            c57508yjj.setVisibility(8);
        }
        TransactionHeaderInfoBean transactionHeaderInfoBean = this.valueOf;
        if (transactionHeaderInfoBean != null) {
            List<TransactionHeaderInfoBean.HeaderSimpleDataBean> headerDataList = transactionHeaderInfoBean.getHeaderDataList();
            if (headerDataList == null || headerDataList.isEmpty()) {
                AbstractC16513elO abstractC16513elO2 = this.OLrzqt;
                if (abstractC16513elO2 != null && (view = abstractC16513elO2.KWHzl) != null) {
                    view.setVisibility(8);
                }
                AbstractC16513elO abstractC16513elO3 = this.OLrzqt;
                if (abstractC16513elO3 == null || (c57422yiC = abstractC16513elO3.EZpvd) == null) {
                    return;
                }
                c57422yiC.setVisibility(8);
                return;
            }
            AbstractC16513elO abstractC16513elO4 = this.OLrzqt;
            if (abstractC16513elO4 != null && (view2 = abstractC16513elO4.KWHzl) != null) {
                view2.setVisibility(0);
            }
            AbstractC16513elO abstractC16513elO5 = this.OLrzqt;
            if (abstractC16513elO5 != null && (c57422yiC3 = abstractC16513elO5.EZpvd) != null) {
                c57422yiC3.setVisibility(0);
            }
            AbstractC16513elO abstractC16513elO6 = this.OLrzqt;
            if (abstractC16513elO6 == null || (c57422yiC2 = abstractC16513elO6.EZpvd) == null) {
                return;
            }
            c57422yiC2.setViewDataBean(transactionHeaderInfoBean);
        }
    }

    public final void AEQbTJ() {
        C57508yjj c57508yjj;
        View view;
        C57508yjj c57508yjj2;
        C57508yjj c57508yjj3;
        View view2;
        C57422yiC c57422yiC;
        AbstractC16513elO abstractC16513elO = this.OLrzqt;
        if (abstractC16513elO != null && (c57422yiC = abstractC16513elO.EZpvd) != null) {
            c57422yiC.setVisibility(8);
        }
        List<C57512yjn.ActionBar> list = this.AEQbTJ;
        if (list == null || list.isEmpty()) {
            AbstractC16513elO abstractC16513elO2 = this.OLrzqt;
            if (abstractC16513elO2 != null && (view = abstractC16513elO2.KWHzl) != null) {
                view.setVisibility(8);
            }
            AbstractC16513elO abstractC16513elO3 = this.OLrzqt;
            if (abstractC16513elO3 == null || (c57508yjj = abstractC16513elO3.OLrzqt) == null) {
                return;
            }
            c57508yjj.setVisibility(8);
            return;
        }
        AbstractC16513elO abstractC16513elO4 = this.OLrzqt;
        if (abstractC16513elO4 != null && (view2 = abstractC16513elO4.KWHzl) != null) {
            view2.setVisibility(0);
        }
        AbstractC16513elO abstractC16513elO5 = this.OLrzqt;
        if (abstractC16513elO5 != null && (c57508yjj3 = abstractC16513elO5.OLrzqt) != null) {
            c57508yjj3.setVisibility(0);
        }
        AbstractC16513elO abstractC16513elO6 = this.OLrzqt;
        if (abstractC16513elO6 == null || (c57508yjj2 = abstractC16513elO6.OLrzqt) == null) {
            return;
        }
        List<C57512yjn.ActionBar> list2 = this.AEQbTJ;
        Intrinsics.copydefault(list2);
        C57508yjj.setData$default(c57508yjj2, C56402yEa.EZpvd(list2), 0, null, null, false, 30, null);
    }

    public final void OLrzqt() {
        C57468yiw c57468yiw;
        AbstractC16513elO abstractC16513elO = this.OLrzqt;
        if (abstractC16513elO == null || (c57468yiw = abstractC16513elO.copydefault) == null) {
            return;
        }
        if (copydefault() == Style.ASSET_GROUP) {
            c57468yiw.copydefault().setOKDSType(262);
            c57468yiw.EZpvd().setOKDSType(260);
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("primary_button_content") : null;
        if (string == null) {
            string = "";
        }
        c57468yiw.setPrimaryButtonText(string);
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("secondary_button_content") : null;
        c57468yiw.setSecondaryButtonText(string2 != null ? string2 : "");
        c57468yiw.setPrimaryButtonCallBack(new Function0() { // from class: o.gbI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKWBTCAssetTipFragment.OLrzqt(this.copydefault);
            }
        });
        c57468yiw.setSecondaryButtonCallBack(new Function0() { // from class: o.gbK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKWBTCAssetTipFragment.gEmmrt(this.EZpvd);
            }
        });
    }

    public static final Unit OLrzqt(OKWBTCAssetTipFragment oKWBTCAssetTipFragment) {
        Function0<Unit> function0 = oKWBTCAssetTipFragment.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(OKWBTCAssetTipFragment oKWBTCAssetTipFragment) {
        Function0<Unit> function0 = oKWBTCAssetTipFragment.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }
}
