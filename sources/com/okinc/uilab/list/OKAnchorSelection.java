package com.okinc.uilab.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.uilab.list.OKAnchorSelection;
import com.okinc.uilab.stateful.StatefulView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55039xcS;
import o.C52761wXj;
import o.C54950xaj;
import o.C55042xcV;
import o.C55043xcW;
import o.C55045xcY;
import o.C55046xcZ;
import o.C55102xdc;
import o.C55107xdh;
import o.C55173xeu;
import o.C55230xfy;
import o.C55298xhM;
import o.C56444yFp;
import o.InterfaceC55105xdf;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OKAnchorSelection extends RelativeLayout {
    public int AEQbTJ;
    public C55173xeu AYXKKw;
    public List<String> AhwBna;
    public OKAnchorSelectionStyle AkhnZx;
    public Map<Integer, InterfaceC55105xdf> DbNXlk;
    public int EZpvd;
    public Function2<? super C55043xcW, Object, Unit> KWHzl;
    public final C54950xaj OLrzqt;
    public C55107xdh copydefault;
    public AbstractC55039xcS<C55046xcZ> djBIcL;
    public int ejfBZ;
    public List<InterfaceC55105xdf> fetchVPNInfo;
    public Function1<? super CharSequence, Unit> gEmmrt;
    public final List<C55046xcZ> isConnected;
    public LinearLayoutManager valueOf;
    public final List<C55102xdc> values;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKAnchorSelectionStyle.values().length];
            try {
                iArr[OKAnchorSelectionStyle.PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKAnchorSelectionStyle.SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKAnchorSelection(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super o.xcW, java.lang.Object, kotlin.Unit>, kotlin.jvm.functions.Function2<o.xcW, java.lang.Object, kotlin.Unit> */
    public final Function2<C55043xcW, Object, Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55173xeu copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.CharSequence, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.CharSequence, kotlin.Unit> */
    public final Function1<CharSequence, Unit> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBehavior(@NotNull BottomSheetBehavior<?> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertViewCallback(Function2<? super C55043xcW, Object, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmptyView(C55173xeu c55173xeu) {
        this.AYXKKw = c55173xeu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSearchResultCallback(Function1<? super CharSequence, Unit> function1) {
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceDataList(@NotNull List<InterfaceC55105xdf> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fetchVPNInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InterfaceC55105xdf> valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:34) call: com.okinc.uilab.list.OKAnchorSelection.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ OKAnchorSelection(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKAnchorSelection(@NotNull Context context, AttributeSet attributeSet) {
        C55173xeu c55173xeu;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C54950xaj c54950xajKWHzl = C54950xaj.KWHzl(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54950xajKWHzl, "");
        this.OLrzqt = c54950xajKWHzl;
        OKAnchorSelectionStyle oKAnchorSelectionStyle = OKAnchorSelectionStyle.PAGE;
        this.AkhnZx = oKAnchorSelectionStyle;
        this.EZpvd = ContextCompat.getColor(context, C52761wXj.Activity.EZpvd);
        this.fetchVPNInfo = new ArrayList();
        this.AhwBna = new ArrayList();
        this.DbNXlk = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        this.isConnected = arrayList;
        this.values = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.OFhtUX);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setConvertViewId(typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.QSLkRj, 0));
        int integer = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.OHqIaq, 0);
        if (integer != 0 && integer == 1) {
            oKAnchorSelectionStyle = OKAnchorSelectionStyle.SHEET;
        }
        setStyle(oKAnchorSelectionStyle);
        typedArrayObtainStyledAttributes.recycle();
        if (this.AEQbTJ != 0) {
            AhwBna();
        }
        RecyclerView recyclerView = c54950xajKWHzl.AhwBna;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.valueOf = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        if (this.AEQbTJ != 0) {
            recyclerView.setAdapter(this.djBIcL);
        }
        C55107xdh c55107xdh = new C55107xdh(context, arrayList, this.EZpvd);
        this.copydefault = c55107xdh;
        recyclerView.addItemDecoration(c55107xdh);
        recyclerView.addItemDecoration(new C55045xcY(context, 1));
        c54950xajKWHzl.OLrzqt.setLayoutManager(this.valueOf);
        c54950xajKWHzl.KWHzl.EZpvd().addTextChangedListener(new StateListAnimator());
        View viewAEQbTJ = c54950xajKWHzl.AEQbTJ.AEQbTJ(StatefulView.Status.Empty);
        if (viewAEQbTJ == null || (c55173xeu = (C55173xeu) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.gasjUx)) == null) {
            c55173xeu = null;
        } else {
            ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C55298xhM.OLrzqt(192, context);
            layoutParams2.bottomMargin = C55298xhM.OLrzqt(192, context);
            c55173xeu.setEmptyTypeImage(7);
        }
        this.AYXKKw = c55173xeu;
        removeView(c54950xajKWHzl.AEQbTJ);
    }

    public final void setConvertViewId(int i) {
        this.AEQbTJ = i;
        AhwBna();
    }

    public final void setStyle(@NotNull OKAnchorSelectionStyle oKAnchorSelectionStyle) {
        int color;
        Intrinsics.checkNotNullParameter(oKAnchorSelectionStyle, "");
        this.AkhnZx = oKAnchorSelectionStyle;
        int i = ActionBar.KWHzl[oKAnchorSelectionStyle.ordinal()];
        if (i == 1) {
            color = ContextCompat.getColor(getContext(), C52761wXj.Activity.EZpvd);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            color = ContextCompat.getColor(getContext(), C52761wXj.Activity.hOMIpD);
        }
        AEQbTJ(color);
    }

    public final C55042xcV OLrzqt() {
        C55042xcV c55042xcV = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55042xcV, "");
        return c55042xcV;
    }

    public final C55230xfy djBIcL() {
        C55230xfy c55230xfy = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
        return c55230xfy;
    }

    private final void AEQbTJ(int i) {
        this.EZpvd = i;
        setBackgroundColor(i);
        C55107xdh c55107xdh = this.copydefault;
        if (c55107xdh != null) {
            c55107xdh.EZpvd(this.EZpvd);
        }
    }

    public static final class StateListAnimator implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                if (OKAnchorSelection.this.OLrzqt.AYXKKw.getParent() == null) {
                    OKAnchorSelection oKAnchorSelection = OKAnchorSelection.this;
                    oKAnchorSelection.addView(oKAnchorSelection.OLrzqt.AYXKKw);
                    OKAnchorSelection oKAnchorSelection2 = OKAnchorSelection.this;
                    oKAnchorSelection2.removeView(oKAnchorSelection2.OLrzqt.AEQbTJ);
                }
            } else if (OKAnchorSelection.this.OLrzqt.AEQbTJ.getParent() == null) {
                OKAnchorSelection oKAnchorSelection3 = OKAnchorSelection.this;
                oKAnchorSelection3.addView(oKAnchorSelection3.OLrzqt.AEQbTJ);
                OKAnchorSelection oKAnchorSelection4 = OKAnchorSelection.this;
                oKAnchorSelection4.removeView(oKAnchorSelection4.OLrzqt.AYXKKw);
            }
            Function1<CharSequence, Unit> function1GEmmrt = OKAnchorSelection.this.gEmmrt();
            if (function1GEmmrt != null) {
                function1GEmmrt.invoke(editable);
            }
        }
    }

    public final RecyclerView AYXKKw() {
        RecyclerView recyclerView = this.OLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        return recyclerView;
    }

    public final void OLrzqt(@NotNull InterfaceC55105xdf interfaceC55105xdf) {
        Intrinsics.checkNotNullParameter(interfaceC55105xdf, "");
        EZpvd(interfaceC55105xdf);
    }

    public final void setSuspensionTitleBackgroundColor(@ColorInt int i) {
        C55107xdh c55107xdh = this.copydefault;
        if (c55107xdh != null) {
            c55107xdh.EZpvd(i);
        }
        invalidate();
    }

    public final void EZpvd() {
        this.ejfBZ = 0;
        this.AhwBna.clear();
        this.isConnected.clear();
        this.values.clear();
        this.DbNXlk.clear();
        AbstractC55039xcS<C55046xcZ> abstractC55039xcS = this.djBIcL;
        if (abstractC55039xcS != null) {
            abstractC55039xcS.EZpvd(new ArrayList());
        }
        this.fetchVPNInfo.clear();
    }

    public final void setSearchResultList(List<Object> list) {
        if (list == null || list.size() == 0) {
            this.OLrzqt.AEQbTJ.setStatus(StatefulView.Status.Empty);
            return;
        }
        this.OLrzqt.AEQbTJ.setStatus(StatefulView.Status.Content);
        RecyclerView recyclerView = this.OLrzqt.EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new Activity(list, this, recyclerView.getContext(), this.AEQbTJ));
    }

    public static final class Activity extends AbstractC55039xcS<Object> {
        public final /* synthetic */ OKAnchorSelection djBIcL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(List<Object> list, OKAnchorSelection oKAnchorSelection, Context context, int i) {
            super(context, i, list);
            this.djBIcL = oKAnchorSelection;
            Intrinsics.copydefault(context);
        }

        @Override // o.AbstractC55039xcS
        public void EZpvd(C55043xcW c55043xcW, Object obj) {
            Intrinsics.checkNotNullParameter(c55043xcW, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Function2<C55043xcW, Object, Unit> function2KWHzl = this.djBIcL.KWHzl();
            if (function2KWHzl != null) {
                function2KWHzl.invoke(c55043xcW, obj);
            }
        }
    }

    public static /* synthetic */ void setDividerLineVisibility$default(OKAnchorSelection oKAnchorSelection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        oKAnchorSelection.setDividerLineVisibility(z);
    }

    public final void setDividerLineVisibility(boolean z) {
        AbstractC55039xcS<C55046xcZ> abstractC55039xcS = this.djBIcL;
        if (abstractC55039xcS != null) {
            abstractC55039xcS.OLrzqt(z);
        }
        if (z) {
            int i = 0;
            while (true) {
                if (i < this.isConnected.size()) {
                    if (i < this.isConnected.size() - 1) {
                        int i2 = i + 1;
                        if (TextUtils.equals(this.isConnected.get(i).getSuspensionTag(), this.isConnected.get(i2).getSuspensionTag())) {
                            i = i2;
                        }
                    }
                    if (i == this.isConnected.size() - 1 && !this.isConnected.get(i).AEQbTJ()) {
                        this.isConnected.add(i + 1, new C55046xcZ(false, null, null, null, true, 15, null));
                        break;
                    } else {
                        this.isConnected.add(i + 1, new C55046xcZ(false, null, null, null, true, 15, null));
                        i += 2;
                    }
                } else {
                    break;
                }
            }
        } else {
            List<C55046xcZ> list = this.isConnected;
            final Function1 function1 = new Function1() { // from class: o.xdd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(OKAnchorSelection.AEQbTJ((C55046xcZ) obj));
                }
            };
            list.removeIf(new Predicate() { // from class: o.xdb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return OKAnchorSelection.OLrzqt(function1, obj);
                }
            });
        }
        fetchVPNInfo();
        AEQbTJ();
    }

    public static final boolean AEQbTJ(C55046xcZ c55046xcZ) {
        Intrinsics.checkNotNullParameter(c55046xcZ, "");
        return c55046xcZ.AEQbTJ();
    }

    public static final boolean OLrzqt(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final class TaskDescription extends AbstractC55039xcS<C55046xcZ> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(Context context, int i, List<C55046xcZ> list) {
            super(context, i, list);
            Intrinsics.copydefault(context);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/xcW;Ljava/lang/Object;)V */
        @Override // o.AbstractC55039xcS
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(C55043xcW c55043xcW, C55046xcZ c55046xcZ) {
            Function2<C55043xcW, Object, Unit> function2KWHzl;
            Intrinsics.checkNotNullParameter(c55043xcW, "");
            Intrinsics.checkNotNullParameter(c55046xcZ, "");
            if (c55046xcZ.AEQbTJ() || (function2KWHzl = OKAnchorSelection.this.KWHzl()) == null) {
                return;
            }
            function2KWHzl.invoke(c55043xcW, c55046xcZ.OLrzqt());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return ((C55046xcZ) OKAnchorSelection.this.isConnected.get(i)).AEQbTJ() ? 1 : 0;
        }
    }

    public final void AhwBna() {
        TaskDescription taskDescription = new TaskDescription(getContext(), this.AEQbTJ, this.isConnected);
        this.djBIcL = taskDescription;
        this.OLrzqt.AhwBna.setAdapter(taskDescription);
        DbNXlk();
    }

    public final void setIndexList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<String> list2 = this.AhwBna;
        list2.clear();
        list2.addAll(list);
        AEQbTJ();
    }

    public final void fetchVPNInfo() {
        AbstractC55039xcS<C55046xcZ> abstractC55039xcS = this.djBIcL;
        if (abstractC55039xcS != null) {
            abstractC55039xcS.EZpvd(this.isConnected);
        }
    }

    public static /* synthetic */ void setAnchorInCenter$default(OKAnchorSelection oKAnchorSelection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        oKAnchorSelection.setAnchorInCenter(z);
    }

    public final void setAnchorInCenter(boolean z) {
        RelativeLayout relativeLayout = this.OLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = z ? -1 : -2;
            relativeLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public final void EZpvd(@NotNull InterfaceC55105xdf interfaceC55105xdf) {
        AbstractC55039xcS<C55046xcZ> abstractC55039xcS;
        Intrinsics.checkNotNullParameter(interfaceC55105xdf, "");
        this.DbNXlk.put(Integer.valueOf(this.ejfBZ), interfaceC55105xdf);
        int size = interfaceC55105xdf.getSectionDataList().size();
        for (int i = 0; i < size; i++) {
            this.isConnected.add(new C55046xcZ(interfaceC55105xdf.getShowSuspension(), interfaceC55105xdf.getSuspensionTag(), interfaceC55105xdf.getSectionDataList(), interfaceC55105xdf.getSectionDataList().get(i), false, 16, null));
            if (i == interfaceC55105xdf.getSectionDataList().size() - 1 && (abstractC55039xcS = this.djBIcL) != null && abstractC55039xcS.OLrzqt()) {
                this.isConnected.add(new C55046xcZ(false, null, null, null, true, 15, null));
            }
        }
        this.ejfBZ++;
        DbNXlk();
    }

    public final void DbNXlk() {
        AbstractC55039xcS<C55046xcZ> abstractC55039xcS = this.djBIcL;
        if (abstractC55039xcS != null) {
            abstractC55039xcS.EZpvd(this.isConnected);
        }
        C55107xdh c55107xdh = this.copydefault;
        if (c55107xdh != null) {
            c55107xdh.EZpvd(this.isConnected);
        }
        if (this.ejfBZ == 0) {
            return;
        }
        AEQbTJ();
    }

    public final void AEQbTJ() {
        this.values.clear();
        if (this.AhwBna.size() == 0) {
            return;
        }
        int i = this.ejfBZ;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC55105xdf interfaceC55105xdf = this.DbNXlk.get(Integer.valueOf(i2));
            Intrinsics.copydefault(interfaceC55105xdf);
            int size = interfaceC55105xdf.getSectionDataList().size();
            AbstractC55039xcS<C55046xcZ> abstractC55039xcS = this.djBIcL;
            if (abstractC55039xcS != null && abstractC55039xcS.OLrzqt()) {
                size++;
            }
            for (int i3 = 0; i3 < size; i3++) {
                this.values.add(new C55102xdc(false, this.AhwBna.get(i2), null, 5, null));
            }
        }
        this.OLrzqt.OLrzqt.OLrzqt(this.values).requestLayout();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OKAnchorSelectionStyle {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OKAnchorSelectionStyle[] $VALUES;
        public static final OKAnchorSelectionStyle PAGE = new OKAnchorSelectionStyle("PAGE", 0, 0);
        public static final OKAnchorSelectionStyle SHEET = new OKAnchorSelectionStyle("SHEET", 1, 1);
        private final int styleInt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OKAnchorSelectionStyle[] $values() {
            return new OKAnchorSelectionStyle[]{PAGE, SHEET};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OKAnchorSelectionStyle> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStyleInt() {
            return this.styleInt;
        }

        private OKAnchorSelectionStyle(String str, int i, int i2) {
            this.styleInt = i2;
        }

        static {
            OKAnchorSelectionStyle[] oKAnchorSelectionStyleArr$values = $values();
            $VALUES = oKAnchorSelectionStyleArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(oKAnchorSelectionStyleArr$values);
        }

        public static OKAnchorSelectionStyle valueOf(String str) {
            return (OKAnchorSelectionStyle) Enum.valueOf(OKAnchorSelectionStyle.class, str);
        }

        public static OKAnchorSelectionStyle[] values() {
            return (OKAnchorSelectionStyle[]) $VALUES.clone();
        }
    }

    public final int copydefault(@NotNull InterfaceC55105xdf interfaceC55105xdf) {
        Intrinsics.checkNotNullParameter(interfaceC55105xdf, "");
        int i = 0;
        for (C55046xcZ c55046xcZ : this.isConnected) {
            if (interfaceC55105xdf.getShowSuspension() == c55046xcZ.getShowSuspension() && Intrinsics.EZpvd((Object) interfaceC55105xdf.getSuspensionTag(), (Object) c55046xcZ.getSuspensionTag()) && Intrinsics.EZpvd(interfaceC55105xdf.getSectionDataList(), c55046xcZ.getSectionDataList())) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
