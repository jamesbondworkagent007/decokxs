package com.okinc.tradeuilib.widget.tradewith;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.okuser.data.User;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeuilib.widget.tradewith.TradeWithCryptoSelectDialog;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC49520uqB;
import o.C33064mpR;
import o.C33069mpW;
import o.C33070mpX;
import o.C43316rmw;
import o.C49511upt;
import o.C52781wYc;
import o.C54589xNz;
import o.C55697xoo;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C59467zhb;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.uBO;
import o.wXX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TradeWithCryptoSelectDialog extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public Function1<? super String, Unit> AYXKKw;
    public Function0<Unit> AhwBna;
    public AbstractC49520uqB KWHzl;
    public String valueOf;
    public boolean EZpvd = true;
    public boolean djBIcL = true;
    public ArrayList<Object> AEQbTJ = new ArrayList<>();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.uBJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TradeWithCryptoSelectDialog.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Object> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.AhwBna = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super String, Unit> function1) {
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.djBIcL = z;
    }

    public static final class CryptoData {
        public static final int $stable = 8;
        private final String cryptoIconUrl;
        private final String cryptoName;
        private boolean isSelected;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CryptoData copy$default(CryptoData cryptoData, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cryptoData.cryptoIconUrl;
            }
            if ((i & 2) != 0) {
                str2 = cryptoData.cryptoName;
            }
            if ((i & 4) != 0) {
                z = cryptoData.isSelected;
            }
            return cryptoData.copy(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.cryptoIconUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.cryptoName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.isSelected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CryptoData copy(String str, String str2, boolean z) {
            return new CryptoData(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CryptoData)) {
                return false;
            }
            CryptoData cryptoData = (CryptoData) obj;
            return Intrinsics.EZpvd((Object) this.cryptoIconUrl, (Object) cryptoData.cryptoIconUrl) && Intrinsics.EZpvd((Object) this.cryptoName, (Object) cryptoData.cryptoName) && this.isSelected == cryptoData.isSelected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCryptoIconUrl() {
            return this.cryptoIconUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCryptoName() {
            return this.cryptoName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.cryptoIconUrl;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.cryptoName;
            return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSelected);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isSelected() {
            return this.isSelected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSelected(boolean z) {
            this.isSelected = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CryptoData(cryptoIconUrl=" + this.cryptoIconUrl + ", cryptoName=" + this.cryptoName + ", isSelected=" + this.isSelected + ")";
        }

        public CryptoData(String str, String str2, boolean z) {
            this.cryptoIconUrl = str;
            this.cryptoName = str2;
            this.isSelected = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:36) call: com.okinc.tradeuilib.widget.tradewith.TradeWithCryptoSelectDialog.CryptoData.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ CryptoData(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw EZpvd() {
        return new C43316rmw();
    }

    private final C43316rmw OLrzqt() {
        return (C43316rmw) this.copydefault.getValue();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.widget.tradewith.TradeWithCryptoSelectDialog.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.tradeuilib.widget.tradewith.TradeWithCryptoSelectDialog$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TradeWithCryptoSelectDialog newInstance$default(Activity activity, ArrayList arrayList, Function1 function1, boolean z, String str, boolean z2, int i, Object obj) {
            Function1 function12 = (i & 2) != 0 ? null : function1;
            String str2 = (i & 8) != 0 ? null : str;
            if ((i & 16) != 0) {
                z2 = true;
            }
            return activity.KWHzl(arrayList, function12, z, str2, z2);
        }

        public final TradeWithCryptoSelectDialog KWHzl(@NotNull ArrayList<Object> arrayList, Function1<? super String, Unit> function1, boolean z, String str, boolean z2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            TradeWithCryptoSelectDialog tradeWithCryptoSelectDialog = new TradeWithCryptoSelectDialog();
            tradeWithCryptoSelectDialog.AEQbTJ().addAll(arrayList);
            tradeWithCryptoSelectDialog.EZpvd(function1);
            tradeWithCryptoSelectDialog.valueOf = str;
            tradeWithCryptoSelectDialog.KWHzl(z);
            tradeWithCryptoSelectDialog.OLrzqt(z2);
            return tradeWithCryptoSelectDialog;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
        c52781wYc.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        AbstractC49520uqB abstractC49520uqB = (AbstractC49520uqB) DataBindingUtil.inflate(LayoutInflater.from(getContext()), C49511upt.StateListAnimator.djBIcL, constraintLayout, true);
        this.KWHzl = abstractC49520uqB;
        if (abstractC49520uqB == null) {
            Intrinsics.gEmmrt("");
            abstractC49520uqB = null;
        }
        abstractC49520uqB.EZpvd.setText(this.EZpvd ? C33070mpX.AYXKKw(C49511upt.Activity.dNCPSb) : C33070mpX.AYXKKw(C49511upt.Activity.djSkpj));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
        AhwBna();
        copydefault(this.AEQbTJ);
    }

    private final void KWHzl() {
        AbstractC49520uqB abstractC49520uqB = this.KWHzl;
        AbstractC49520uqB abstractC49520uqB2 = null;
        if (abstractC49520uqB == null) {
            Intrinsics.gEmmrt("");
            abstractC49520uqB = null;
        }
        abstractC49520uqB.OLrzqt.setAdapter(OLrzqt());
        AbstractC49520uqB abstractC49520uqB3 = this.KWHzl;
        if (abstractC49520uqB3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49520uqB2 = abstractC49520uqB3;
        }
        abstractC49520uqB2.OLrzqt.setLayoutManager(new LinearLayoutManager(getContext()));
        OLrzqt().register(CryptoData.class, new uBO(new Function1() { // from class: o.uBK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeWithCryptoSelectDialog.copydefault(this.KWHzl, (TradeWithCryptoSelectDialog.CryptoData) obj);
            }
        }));
        C33064mpR.OLrzqt(OLrzqt(), (List<? extends Object>) this.AEQbTJ);
    }

    public static final Unit copydefault(TradeWithCryptoSelectDialog tradeWithCryptoSelectDialog, CryptoData cryptoData) {
        Intrinsics.checkNotNullParameter(cryptoData, "");
        Function1<? super String, Unit> function1 = tradeWithCryptoSelectDialog.AYXKKw;
        if (function1 != null) {
            function1.invoke(cryptoData.getCryptoName());
        }
        tradeWithCryptoSelectDialog.dismiss();
        return Unit.INSTANCE;
    }

    private final void AhwBna() {
        AbstractC49520uqB abstractC49520uqB = this.KWHzl;
        if (abstractC49520uqB == null) {
            Intrinsics.gEmmrt("");
            abstractC49520uqB = null;
        }
        TextView textView = abstractC49520uqB.KWHzl;
        if (textView != null) {
            String str = this.valueOf;
            if (str != null && str.length() != 0) {
                textView.setText(this.valueOf);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
    }

    public final void copydefault(ArrayList<Object> arrayList) {
        String strCopydefault = copydefault((List<? extends Object>) arrayList);
        AbstractC49520uqB abstractC49520uqB = this.KWHzl;
        AbstractC49520uqB abstractC49520uqB2 = null;
        if (abstractC49520uqB == null) {
            Intrinsics.gEmmrt("");
            abstractC49520uqB = null;
        }
        OKReminder oKReminder = abstractC49520uqB.AEQbTJ;
        Intrinsics.copydefault(oKReminder);
        oKReminder.setVisibility(StringsKt__StringsKt.fARcdN((CharSequence) strCopydefault) ^ true ? 0 : 8);
        oKReminder.setStyle(0);
        oKReminder.setCloseIconVisibility(false);
        if (!StringsKt__StringsKt.fARcdN((CharSequence) strCopydefault)) {
            AbstractC49520uqB abstractC49520uqB3 = this.KWHzl;
            if (abstractC49520uqB3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC49520uqB2 = abstractC49520uqB3;
            }
            OKReminder oKReminder2 = abstractC49520uqB2.AEQbTJ;
            Intrinsics.copydefault(strCopydefault, "");
            oKReminder2.setMessage((CharSequence) strCopydefault);
        }
    }

    public final String copydefault(List<? extends Object> list) {
        final InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        if (list == null || list.isEmpty() || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return "";
        }
        User userAhwBna = C55697xoo.OLrzqt.AhwBna();
        final boolean z = !this.djBIcL || (userAhwBna != null ? userAhwBna.isVip() : false);
        Sequence sequenceDbNXlk = C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(list), Application.OLrzqt);
        Intrinsics.copydefault(sequenceDbNXlk, "");
        List listZuBGHE = C59467zhb.zuBGHE(C59467zhb.DbNXlk(C59467zhb.fJNWhG(sequenceDbNXlk, new Function1() { // from class: o.uBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TradeWithCryptoSelectDialog.EZpvd((TradeWithCryptoSelectDialog.CryptoData) obj);
            }
        }), new Function1() { // from class: o.uBI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(TradeWithCryptoSelectDialog.copydefault(interfaceC54581xNrOLrzqt, z, (java.lang.String) obj));
            }
        }));
        return listZuBGHE.isEmpty() ? "" : C33069mpW.copydefault(C49511upt.Activity.AkhnZx, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, CollectionsKt___CollectionsKt.joinToString$default(listZuBGHE, ", ", null, null, 0, null, null, 62, null))));
    }

    public static final String EZpvd(CryptoData cryptoData) {
        Intrinsics.checkNotNullParameter(cryptoData, "");
        String cryptoName = cryptoData.getCryptoName();
        if (cryptoName == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) cryptoName))) {
            return null;
        }
        return cryptoName;
    }

    public static final boolean copydefault(InterfaceC54581xNr interfaceC54581xNr, boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNr.AhwBna(str);
        if (tradeCoinInfoAhwBna == null) {
            return false;
        }
        return Intrinsics.EZpvd((Object) tradeCoinInfoAhwBna.getSupportAutoEarn(), (Object) "1") || (z && (Intrinsics.EZpvd((Object) tradeCoinInfoAhwBna.getSupportAutoStaking(), (Object) "1") || Intrinsics.EZpvd((Object) tradeCoinInfoAhwBna.getSupportAutoLend(), (Object) "1")));
    }

    public static final class Application implements Function1<Object, Boolean> {
        public static final Application OLrzqt = new Application();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof CryptoData);
        }
    }
}
