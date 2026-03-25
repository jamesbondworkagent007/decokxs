package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C53565wnr extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public AbstractC48410uQl fetchVPNInfo;
    public Function1<? super java.util.ArrayList<SelectCoinData>, Unit> valueOf;
    public float DbNXlk = 0.98f;
    public final boolean isConnected = true;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wns
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53565wnr.fetchVPNInfo();
        }
    });
    public final java.util.ArrayList<SelectCoinData> AkhnZx = new java.util.ArrayList<>();
    public java.util.ArrayList<SelectCoinData> values = new java.util.ArrayList<>();
    public int fJNWhG = 1;
    public int ejfBZ = 20;
    public java.lang.String fIwbmz = "";

    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull AbstractC48410uQl abstractC48410uQl) {
        Intrinsics.checkNotNullParameter(abstractC48410uQl, "");
        this.fetchVPNInfo = abstractC48410uQl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.okinc.unify_trade.bot.data.SelectCoinData>, kotlin.Unit>, kotlin.jvm.functions.Function1<java.util.ArrayList<com.okinc.unify_trade.bot.data.SelectCoinData>, kotlin.Unit> */
    public final Function1<java.util.ArrayList<SelectCoinData>, Unit> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.fJNWhG;
    }

    public void EZpvd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.util.ArrayList<SelectCoinData>, Unit> function1) {
        this.valueOf = function1;
    }

    public boolean OLrzqt() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<SelectCoinData> gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<SelectCoinData> valueOf() {
        return this.values;
    }

    /* JADX INFO: renamed from: o.wnr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wnr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C53565wnr newInstance$default(Activity activity, int i, int i2, java.lang.String str, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, Function1 function1, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = 1;
            }
            int i4 = i;
            if ((i3 & 2) != 0) {
                i2 = 20;
            }
            int i5 = i2;
            if ((i3 & 4) != 0) {
                str = C33070mpX.AYXKKw(C55688xof.Application.IResultReceiverDefault);
            }
            return activity.EZpvd(i4, i5, str, arrayList, arrayList2, function1);
        }

        public final C53565wnr EZpvd(int i, int i2, @NotNull java.lang.String str, @NotNull java.util.ArrayList<SelectCoinData> arrayList, @NotNull java.util.ArrayList<SelectCoinData> arrayList2, Function1<? super java.util.ArrayList<SelectCoinData>, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            C53565wnr c53565wnr = new C53565wnr();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("select_coin_list", arrayList2);
            bundle.putParcelableArrayList("coin_list", arrayList);
            bundle.putInt("select_min", i);
            bundle.putInt("select_max", i2);
            bundle.putString("select_tip", str);
            c53565wnr.setArguments(bundle);
            c53565wnr.KWHzl(function1);
            return c53565wnr;
        }
    }

    public final AbstractC48410uQl AhwBna() {
        AbstractC48410uQl abstractC48410uQl = this.fetchVPNInfo;
        if (abstractC48410uQl != null) {
            return abstractC48410uQl;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: renamed from: o.wnr$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void afterTextChanged(android.text.Editable editable) {
            java.util.List listGEmmrt;
            boolean z;
            C54589xNz c54589xNz;
            InterfaceC54581xNr interfaceC54581xNrCopydefault;
            InterfaceC54581xNr interfaceC54581xNrCopydefault2;
            for (SelectCoinData selectCoinData : C53565wnr.this.gEmmrt()) {
                if (editable == null || editable.length() == 0 || (interfaceC54581xNrCopydefault = (c54589xNz = C54589xNz.EZpvd).copydefault()) == null) {
                    z = false;
                } else {
                    java.lang.String string = editable.toString();
                    java.util.Locale locale = java.util.Locale.ROOT;
                    java.lang.String upperCase = string.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    boolean zAkhnZx = interfaceC54581xNrCopydefault.AkhnZx(upperCase);
                    z = true;
                    if (zAkhnZx && (interfaceC54581xNrCopydefault2 = c54589xNz.copydefault()) != null) {
                        java.lang.String upperCase2 = editable.toString().toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                        if (interfaceC54581xNrCopydefault2.gEmmrt(upperCase2)) {
                        }
                    }
                }
                selectCoinData.setSearchVisible(z);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) editable)) {
                listGEmmrt = C47222tlv.searchAndSortItems$default(C47222tlv.KWHzl, java.lang.String.valueOf(editable), C53565wnr.this.gEmmrt(), FuzzySearchEventSourceEnum.OKTRADE_RECURRING.getSource(), false, 8, null);
            } else {
                listGEmmrt = C53565wnr.this.gEmmrt();
            }
            C49952uyJ.updateDataOrNoResult$default(C53565wnr.this.copydefault(), listGEmmrt, C33070mpX.AYXKKw(C55688xof.Application.dXcUrg), 0, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw fetchVPNInfo() {
        return new C43316rmw();
    }

    public final C43316rmw copydefault() {
        return (C43316rmw) this.djBIcL.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    @Override // o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String name;
        java.lang.String name2;
        java.lang.String name3;
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AEQbTJ((AbstractC48410uQl) DataBindingUtil.inflate(getCustomLayoutInflater(), C48033uCm.Activity.alsFma, constraintLayout, true));
        android.os.Bundle arguments = getArguments();
        java.util.ArrayList<SelectCoinData> parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("select_coin_list") : null;
        android.os.Bundle arguments2 = getArguments();
        java.util.ArrayList<SelectCoinData> parcelableArrayList2 = arguments2 != null ? arguments2.getParcelableArrayList("coin_list") : null;
        android.os.Bundle arguments3 = getArguments();
        this.fJNWhG = arguments3 != null ? arguments3.getInt("select_min") : 0;
        android.os.Bundle arguments4 = getArguments();
        this.ejfBZ = arguments4 != null ? arguments4.getInt("select_max") : 0;
        android.os.Bundle arguments5 = getArguments();
        if (arguments5 != null && (string = arguments5.getString("select_tip", "")) != null) {
            str = string;
        }
        this.fIwbmz = str;
        if (parcelableArrayList != null) {
            for (SelectCoinData selectCoinData : parcelableArrayList) {
                java.util.ArrayList<SelectCoinData> arrayList = this.values;
                java.lang.String name4 = selectCoinData.getName();
                if (name4 != null) {
                    TradeCoinInfo tradeCoinInfoOLrzqt = C54799xVt.AEQbTJ.OLrzqt(name4);
                    if (tradeCoinInfoOLrzqt == null || (name3 = tradeCoinInfoOLrzqt.getName()) == null) {
                        name3 = selectCoinData.getName();
                    }
                    if (name3 == null) {
                    }
                } else {
                    name3 = selectCoinData.getName();
                }
                selectCoinData.setSecondary(name3);
                arrayList.add(selectCoinData);
            }
        }
        if (parcelableArrayList2 != null) {
            for (SelectCoinData selectCoinData2 : parcelableArrayList2) {
                java.util.ArrayList<SelectCoinData> arrayList2 = this.AkhnZx;
                java.lang.String icon = selectCoinData2.getIcon();
                java.lang.String name5 = selectCoinData2.getName();
                boolean zIsShow = selectCoinData2.isShow();
                java.lang.String instId = selectCoinData2.getInstId();
                java.lang.String name6 = selectCoinData2.getName();
                if (name6 != null) {
                    TradeCoinInfo tradeCoinInfoOLrzqt2 = C54799xVt.AEQbTJ.OLrzqt(name6);
                    if (tradeCoinInfoOLrzqt2 == null || (name2 = tradeCoinInfoOLrzqt2.getName()) == null) {
                        name2 = selectCoinData2.getName();
                    }
                    if (name2 != null) {
                        name = name2;
                    }
                } else {
                    name = selectCoinData2.getName();
                }
                arrayList2.add(new SelectCoinData(icon, name5, "", false, zIsShow, false, instId, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, name, AudioStats.AUDIO_AMPLITUDE_NONE, 6048, null));
            }
        }
        AhwBna().OLrzqt.setText(this.fIwbmz);
        AkhnZx();
        values();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomAction));
        wyf.setOKDSSize(52);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.wnr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C53565wnr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53565wnr c53565wnr) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c53565wnr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.AEQbTJ();
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wnr$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C53565wnr KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53565wnr c53565wnr) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c53565wnr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.valueOf().clear();
                java.util.ArrayList<SelectCoinData> arrayListGEmmrt = this.KWHzl.gEmmrt();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : arrayListGEmmrt) {
                    if (((SelectCoinData) obj).isSelected()) {
                        arrayList.add(obj);
                    }
                }
                if (this.KWHzl.OLrzqt()) {
                    this.KWHzl.valueOf().addAll(arrayList);
                    java.util.ArrayList<SelectCoinData> arrayListValueOf = this.KWHzl.valueOf();
                    Function1<java.util.ArrayList<SelectCoinData>, Unit> function1AYXKKw = this.KWHzl.AYXKKw();
                    if (function1AYXKKw != null) {
                        function1AYXKKw.invoke(arrayListValueOf);
                    }
                    this.KWHzl.dismissAllowingStateLoss();
                }
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.valueOf = null;
    }

    private final void AkhnZx() {
        AhwBna().AEQbTJ.EZpvd().addTextChangedListener(new ActionBar());
    }

    private final void values() {
        AhwBna().KWHzl.setAdapter(copydefault());
        AhwBna().KWHzl.setLayoutManager(new LinearLayoutManager(getContext()));
        copydefault().register(CommonEmptyData.class, new C50041uzt(null, 1, null));
        C43316rmw c43316rmwCopydefault = copydefault();
        java.lang.String string = AhwBna().AEQbTJ.EZpvd().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        c43316rmwCopydefault.register(SelectCoinData.class, new C53557wnj(string, new Function2() { // from class: o.wno
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53565wnr.EZpvd(this.AEQbTJ, (SelectCoinData) obj, (wYK) obj2);
            }
        }));
        for (SelectCoinData selectCoinData : this.AkhnZx) {
            for (SelectCoinData selectCoinData2 : this.values) {
                if (Intrinsics.EZpvd((java.lang.Object) selectCoinData2.getName(), (java.lang.Object) selectCoinData.getName())) {
                    selectCoinData.setSelected(true);
                    selectCoinData.setRatio(selectCoinData2.getRatio());
                    selectCoinData.setMinPrice(selectCoinData2.getMinPrice());
                    selectCoinData.setMaxPrice(selectCoinData2.getMaxPrice());
                }
            }
        }
        C49952uyJ.updateDataOrNoResult$default(copydefault(), this.AkhnZx, C33070mpX.AYXKKw(C55688xof.Application.dXcUrg), 0, 4, null);
    }

    public static final Unit EZpvd(C53565wnr c53565wnr, SelectCoinData selectCoinData, wYK wyk) {
        Intrinsics.checkNotNullParameter(selectCoinData, "");
        Intrinsics.checkNotNullParameter(wyk, "");
        if (c53565wnr.OLrzqt(selectCoinData)) {
            return Unit.INSTANCE;
        }
        selectCoinData.setSelected(!selectCoinData.isSelected());
        wyk.setSelected(!wyk.isSelected());
        c53565wnr.EZpvd();
        return Unit.INSTANCE;
    }

    public boolean OLrzqt(@NotNull SelectCoinData selectCoinData) {
        Intrinsics.checkNotNullParameter(selectCoinData, "");
        if (selectCoinData.isSelected()) {
            if (djBIcL() <= this.fJNWhG) {
                AhwBna().OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DPhTBN));
                return true;
            }
        } else if (djBIcL() >= this.ejfBZ) {
            AhwBna().OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DPhTBN));
            return true;
        }
        AhwBna().OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        return false;
    }

    public final int djBIcL() {
        java.util.Iterator<SelectCoinData> it = this.AkhnZx.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        int i = 0;
        while (it.hasNext()) {
            SelectCoinData next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            if (next.isSelected()) {
                i++;
            }
        }
        return i;
    }
}
