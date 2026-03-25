package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.bumptech.glide.Glide;
import com.okinc.unify_trade.biz.ArbitrageOrderBean;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.bot.AiBotDto;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.vqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51601vqB extends android.widget.LinearLayout {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public int AEQbTJ;
    public java.util.List<java.lang.String> AYXKKw;
    public boolean AhwBna;
    public float AkhnZx;
    public android.widget.TextView KWHzl;
    public int OLrzqt;
    public float copydefault;
    public int djBIcL;
    public int gEmmrt;
    public int isConnected;
    public final java.util.List<android.view.View> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoadedCoins(java.util.List<java.lang.String> list) {
        this.AYXKKw = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51601vqB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.valueOf = new java.util.ArrayList();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.ejfBZ);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getColor(C48033uCm.LoaderManager.fARcdN, C33070mpX.copydefault(C32113mPz.ActionBar.isConnected));
        this.djBIcL = typedArrayObtainStyledAttributes.getColor(C48033uCm.LoaderManager.iwGUEr, C33070mpX.copydefault(C32113mPz.ActionBar.fARcdN));
        this.isConnected = typedArrayObtainStyledAttributes.getColor(C48033uCm.LoaderManager.hDKMBd, C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn));
        this.copydefault = typedArrayObtainStyledAttributes.getDimension(C48033uCm.LoaderManager.fIwbmz, C57681ymx.OLrzqt(this, 3.0f));
        this.OLrzqt = (int) typedArrayObtainStyledAttributes.getDimension(C48033uCm.LoaderManager.getNewProxyInstance, 16.0f);
        this.gEmmrt = typedArrayObtainStyledAttributes.getInt(C48033uCm.LoaderManager.zLjUOn, Integer.MAX_VALUE);
        this.AhwBna = typedArrayObtainStyledAttributes.getBoolean(C48033uCm.LoaderManager.uzCIH, false);
        this.AkhnZx = typedArrayObtainStyledAttributes.getFloat(C48033uCm.LoaderManager.getFieldNames, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
    }

    /* JADX INFO: renamed from: o.vqB$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vqB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final java.util.List<java.lang.String> KWHzl(TacticsData tacticsData) {
        java.lang.String upperCase;
        BizInstrument suggestedInstrument$default;
        java.lang.String upperCase2;
        BizInstrument suggestedInstrument$default2;
        java.util.List<java.lang.String> instIds = tacticsData.getInstIds();
        if (instIds == null) {
            java.lang.String[] strArr = new java.lang.String[1];
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null)) == null || (upperCase = suggestedInstrument$default.getTradeSymbol()) == null) {
                java.lang.String strCopydefault = o.TaskDescription.AEQbTJ(tacticsData.getInstId()).copydefault();
                java.util.Locale locale = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                upperCase = strCopydefault.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
            }
            strArr[0] = upperCase;
            return yDY.copydefault(strArr);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(instIds, 10));
        for (java.lang.String str : instIds) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || (suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, tacticsData.getInstType(), str, null, null, 12, null)) == null || (upperCase2 = suggestedInstrument$default2.getTradeSymbol()) == null) {
                java.lang.String strCopydefault2 = o.TaskDescription.AEQbTJ(str).copydefault();
                java.util.Locale locale2 = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                upperCase2 = strCopydefault2.toUpperCase(locale2);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            }
            arrayList.add(upperCase2);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [136=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ab, code lost:
    
        if (r2 == (r3 != null ? r3.size() : 0)) goto L90;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull TacticsData tacticsData) {
        java.util.List<java.lang.String> listKWHzl;
        AiBotDto ai;
        java.util.List<java.lang.String> instIds;
        java.util.List<java.lang.String> listKWHzl2;
        java.lang.Integer numValueOf;
        java.lang.String strAEQbTJ;
        java.lang.String upperCase;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        java.lang.String orderType = tacticsData.getOrderType();
        switch (orderType.hashCode()) {
            case -1418042064:
                if (orderType.equals("ai_bot")) {
                    BotVo bot = tacticsData.getBot();
                    if (bot == null || (ai = bot.getAi()) == null || (instIds = ai.getInstIds()) == null) {
                        listKWHzl = null;
                    } else {
                        java.util.List<java.lang.String> arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(instIds, 10));
                        java.util.Iterator<T> it = instIds.iterator();
                        while (it.hasNext()) {
                            java.lang.String upperCase2 = o.TaskDescription.AEQbTJ((java.lang.String) it.next()).copydefault().toUpperCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                            arrayList.add(upperCase2);
                        }
                        listKWHzl = arrayList;
                    }
                    if (listKWHzl == null) {
                        listKWHzl = yDY.AhwBna();
                    }
                } else {
                    listKWHzl = KWHzl(tacticsData);
                }
                listKWHzl2 = listKWHzl;
                numValueOf = null;
                break;
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.ArrayList<SmartPortfolioListItem> hoardItemList = tacticsData.getHoardItemList();
                    if (hoardItemList != null) {
                        int size = hoardItemList.size();
                        for (int i = 0; i < size - 1; i++) {
                            hashSet.add(hoardItemList.get(i).getCcy());
                        }
                    }
                    listKWHzl = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(hashSet);
                }
                listKWHzl2 = listKWHzl;
                numValueOf = null;
                break;
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    listKWHzl2 = KWHzl(tacticsData);
                    java.util.Map<java.lang.String, java.lang.String> additionalParams = tacticsData.getShareData().getAdditionalParams();
                    numValueOf = java.lang.Integer.valueOf(C33129mqd.AhwBna(additionalParams != null ? additionalParams.getOrDefault("signal_bot_share_inst_id_count", C33129mqd.gEmmrt(java.lang.Integer.valueOf(listKWHzl2.size()))) : null));
                }
                listKWHzl = KWHzl(tacticsData);
                listKWHzl2 = listKWHzl;
                numValueOf = null;
                break;
            case 1165749981:
                if (orderType.equals("recurring")) {
                    java.util.ArrayList<RecurringListItem> recItemList = tacticsData.getRecItemList();
                    if (recItemList != null) {
                        java.util.List<java.lang.String> arrayList2 = new java.util.ArrayList<>(C56403yEb.AYXKKw(recItemList, 10));
                        java.util.Iterator<T> it2 = recItemList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((RecurringListItem) it2.next()).getCcy());
                        }
                        listKWHzl = arrayList2;
                    } else {
                        listKWHzl = new java.util.ArrayList<>();
                    }
                }
                listKWHzl2 = listKWHzl;
                numValueOf = null;
                break;
            case 1780188297:
                if (orderType.equals("arbitrage")) {
                    java.util.HashSet hashSet2 = new java.util.HashSet();
                    java.util.List<ArbitrageOrderBean> instList = tacticsData.getInstList();
                    if (instList != null) {
                        for (ArbitrageOrderBean arbitrageOrderBean : instList) {
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                            if (interfaceC54581xNrOLrzqt == null) {
                                java.lang.String strCopydefault = o.TaskDescription.AEQbTJ(arbitrageOrderBean.getInstId()).copydefault();
                                java.util.Locale locale = java.util.Locale.ROOT;
                                Intrinsics.checkNotNullExpressionValue(locale, "");
                                upperCase = strCopydefault.toUpperCase(locale);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                            } else {
                                java.lang.String instType = arbitrageOrderBean.getInstType();
                                BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType == null ? "" : instType, arbitrageOrderBean.getInstId(), null, null, 12, null);
                                if (suggestedInstrument$default == null || (upperCase = suggestedInstrument$default.getTradeSymbol()) == null) {
                                }
                            }
                            hashSet2.add(upperCase);
                        }
                    }
                    listKWHzl = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(hashSet2);
                }
                listKWHzl2 = listKWHzl;
                numValueOf = null;
                break;
        }
        if (listKWHzl2.isEmpty()) {
            removeAllViews();
            return;
        }
        java.util.List<java.lang.String> list = this.AYXKKw;
        if (list != null) {
            if (!list.containsAll(listKWHzl2) || !listKWHzl2.containsAll(list)) {
                int size2 = listKWHzl2.size();
                java.util.List<java.lang.String> list2 = this.AYXKKw;
            }
            int size3 = this.valueOf.size();
            for (int i2 = 0; i2 < size3; i2++) {
                android.view.View view = (android.view.View) CollectionsKt___CollectionsKt.AkhnZx(this.valueOf, i2);
                android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(C48033uCm.Application.ITrustedWebActivityCallback) : null;
                if (imageView != null) {
                    ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(getContext());
                    Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
                    java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listKWHzl2, i2);
                    if (str == null || (strAEQbTJ = C52684wUn.AEQbTJ(str)) == null) {
                        strAEQbTJ = "";
                    }
                    C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, strAEQbTJ, "lfit", 48, 48).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getContext())).djBIcL().OLrzqt(OLrzqt(imageView));
                }
            }
            return;
        }
        KWHzl(listKWHzl2, 2, numValueOf != null ? numValueOf.intValue() : listKWHzl2.size());
    }

    /* JADX INFO: renamed from: o.vqB$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static /* synthetic */ void refreshCircleCoins$default(C51601vqB c51601vqB, java.util.List list, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = c51601vqB.gEmmrt;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        c51601vqB.KWHzl(list, i, i2);
    }

    public final void KWHzl(@NotNull java.util.List<java.lang.String> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = list;
        removeAllViews();
        this.valueOf.clear();
        int iMin = java.lang.Math.min(list.size(), i);
        for (int i3 = 0; i3 < iMin; i3++) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.isElapsedRealtimeNanosAvailable, (android.view.ViewGroup) this, false);
            java.util.List<android.view.View> list2 = this.valueOf;
            Intrinsics.copydefault(viewInflate);
            list2.add(viewInflate);
            android.graphics.drawable.Drawable background = viewInflate.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(android.content.res.ColorStateList.valueOf(this.AEQbTJ));
            }
            android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C48033uCm.Application.ITrustedWebActivityCallback);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i4 = this.OLrzqt;
            layoutParams.width = i4;
            layoutParams.height = i4;
            imageView.setLayoutParams(layoutParams);
            java.lang.String strAEQbTJ = C52684wUn.AEQbTJ(list.get(i3));
            pUU.EZpvd("TacticsListItemBinder", ((java.lang.Object) list.get(i3)) + " - loading icon : " + strAEQbTJ);
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(getContext());
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            C5335Nt c5335NtDjBIcL = C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, strAEQbTJ, "lfit", 48, 48).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getContext())).djBIcL();
            Intrinsics.copydefault(imageView);
            c5335NtDjBIcL.OLrzqt(OLrzqt(imageView));
            ViewGroup.LayoutParams layoutParams2 = viewInflate.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.width = this.OLrzqt + C57681ymx.OLrzqt(this, this.AkhnZx * 2.0f);
            layoutParams3.height = this.OLrzqt + C57681ymx.OLrzqt(this, this.AkhnZx * 2.0f);
            if (i3 != 0) {
                C55296xhK.AEQbTJ(layoutParams3, C57681ymx.OLrzqt(this, 0.0f - this.copydefault), 0, 0, 0);
            }
            viewInflate.setLayoutParams(layoutParams3);
            addView(viewInflate);
        }
        if (this.AhwBna) {
            if (i2 <= 2) {
                return;
            }
            android.widget.TextView textView = new android.widget.TextView(getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
            C55296xhK.AEQbTJ(layoutParams4, C57681ymx.OLrzqt(textView, -10.0f), 0, 0, 0);
            layoutParams4.gravity = 80;
            textView.setLayoutParams(layoutParams4);
            textView.setGravity(17);
            textView.setTextAppearance(C52761wXj.LoaderManager.OcIXYQ);
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
            textView.setText(xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2))));
            textView.setMaxLines(1);
            textView.setBackground(C33070mpX.KWHzl(C48033uCm.ActionBar.KWHzl));
            textView.setAutoSizeTextTypeUniformWithConfiguration(6, 10, 1, 2);
            this.KWHzl = textView;
            addView(textView);
            return;
        }
        int i5 = i2 - i;
        if (i5 > 0) {
            android.view.View viewInflate2 = android.view.LayoutInflater.from(getContext()).inflate(i5 > 9 ? C48033uCm.Activity.dNxZaP : C48033uCm.Activity.HJWChPdNQGVJ, (android.view.ViewGroup) this, false);
            android.graphics.drawable.Drawable background2 = viewInflate2.getBackground();
            if (background2 instanceof GradientDrawable) {
                ((GradientDrawable) background2).setColor(android.content.res.ColorStateList.valueOf(this.AEQbTJ));
            }
            android.widget.TextView textView2 = (android.widget.TextView) viewInflate2.findViewById(C48033uCm.Application.getContext);
            android.graphics.drawable.Drawable background3 = textView2.getBackground();
            if (background3 instanceof GradientDrawable) {
                ((GradientDrawable) background3).setColor(android.content.res.ColorStateList.valueOf(this.djBIcL));
            }
            textView2.setTextColor(this.isConnected);
            ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
            layoutParams5.width = i5 > 9 ? -2 : this.OLrzqt;
            layoutParams5.height = this.OLrzqt;
            textView2.setLayoutParams(layoutParams5);
            textView2.setText(Marker.ANY_NON_NULL_MARKER + xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i5))));
            ViewGroup.LayoutParams layoutParams6 = viewInflate2.getLayoutParams();
            Intrinsics.copydefault(layoutParams6, "");
            LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
            C55296xhK.AEQbTJ(layoutParams7, C57681ymx.OLrzqt(this, 0.0f - this.copydefault), 0, 0, 0);
            layoutParams7.width = i5 <= 9 ? this.OLrzqt + C57681ymx.OLrzqt(this, 2.0f) : -2;
            layoutParams7.height = this.OLrzqt + C57681ymx.OLrzqt(this, 2.0f);
            viewInflate2.setLayoutParams(layoutParams7);
            addView(viewInflate2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vqB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshRectCoins$default(C51601vqB c51601vqB, java.util.List list, int i, int i2, Function0 function0, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = c51601vqB.gEmmrt;
        }
        if ((i3 & 8) != 0) {
            function0 = null;
        }
        c51601vqB.KWHzl(list, i, i2, function0);
    }

    public final void KWHzl(@NotNull java.util.List<java.lang.String> list, int i, int i2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        removeAllViews();
        int iMin = java.lang.Math.min(list.size(), i2);
        int i3 = 0;
        int iDp2px$default = 0;
        while (i3 < iMin) {
            if (list.get(i3).length() > 0) {
                android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.RFmUsE, (android.view.ViewGroup) this, false);
                android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C48033uCm.Application.IResultReceiver2Stub);
                C5335Nt c5335NtDjBIcL = Glide.AEQbTJ(getContext()).EZpvd(list.get(i3)).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getContext())).djBIcL();
                Intrinsics.copydefault(imageView);
                c5335NtDjBIcL.OLrzqt(OLrzqt(imageView));
                int iDpInt$default = i3 == 0 ? 0 : C55298xhM.dpInt$default(this.copydefault, (android.content.Context) null, 1, (java.lang.Object) null);
                ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = iDpInt$default;
                viewInflate.setLayoutParams(marginLayoutParams);
                iDp2px$default += C55298xhM.dp2px$default(36.0f, null, 1, null) + iDpInt$default;
                addView(viewInflate);
            }
            i3++;
        }
        android.view.View viewInflate2 = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.DFbvW, (android.view.ViewGroup) this, false);
        android.widget.TextView textView = (android.widget.TextView) viewInflate2.findViewById(C48033uCm.Application.NRYds);
        Ref.IntRef intRef = new Ref.IntRef();
        int i4 = i - i2;
        intRef.element = i4;
        if (i4 > 0) {
            textView.setTextColor(this.isConnected);
            ViewGroup.LayoutParams layoutParams2 = viewInflate2.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.leftMargin = C55298xhM.dpInt$default(this.copydefault, (android.content.Context) null, 1, (java.lang.Object) null);
            viewInflate2.setLayoutParams(marginLayoutParams2);
            viewInflate2.setTag("remain");
            viewInflate2.setOnClickListener(new StateListAnimator(viewInflate2, 1000L, function0));
            addView(viewInflate2);
            while (EZpvd(textView, intRef, viewInflate2) + iDp2px$default + C55298xhM.dpInt$default(this.copydefault, (android.content.Context) null, 1, (java.lang.Object) null) > getWidth()) {
                android.view.View view = null;
                for (android.view.View view2 : ViewGroupKt.getChildren(this)) {
                    if (!Intrinsics.EZpvd(view2.getTag(), (java.lang.Object) "remain")) {
                        view = view2;
                    }
                }
                android.view.View view3 = view;
                if (view3 != null) {
                    removeView(view3);
                    intRef.element++;
                    iDp2px$default -= C55298xhM.dp2px$default(36.0f, null, 1, null) + C55298xhM.dpInt$default(this.copydefault, (android.content.Context) null, 1, (java.lang.Object) null);
                }
            }
            textView.setText(Marker.ANY_NON_NULL_MARKER + xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(intRef.element))));
        }
    }

    public static final int EZpvd(android.widget.TextView textView, Ref.IntRef intRef, android.view.View view) {
        return java.lang.Math.max(C33129mqd.AhwBna(java.lang.Float.valueOf(textView.getPaint().measureText(Marker.ANY_NON_NULL_MARKER + xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(intRef.element)))))) + C55298xhM.dp2px$default(36.0f, null, 1, null), view.getMinimumWidth());
    }

    /* JADX INFO: renamed from: o.vqB$TaskDescription */
    public static final class TaskDescription extends AbstractC5450Se<android.view.View, android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.widget.ImageView gEmmrt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(android.widget.ImageView imageView) {
            super(imageView);
            this.gEmmrt = imageView;
        }

        @Override // o.InterfaceC5462Sq
        public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
            copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
        }

        @Override // o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            this.gEmmrt.setImageDrawable(drawable);
        }

        @Override // o.AbstractC5450Se
        public void OLrzqt(android.graphics.drawable.Drawable drawable) {
            this.gEmmrt.setImageDrawable(drawable);
        }

        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.gEmmrt.setImageDrawable(drawable);
        }
    }

    public final AbstractC5450Se<android.view.View, android.graphics.drawable.Drawable> OLrzqt(android.widget.ImageView imageView) {
        return new TaskDescription(imageView);
    }
}
