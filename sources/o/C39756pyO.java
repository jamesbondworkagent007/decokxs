package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C39756pyO;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39756pyO extends android.widget.FrameLayout implements InterfaceC35970oKl {
    public boolean AEQbTJ;
    public RecyclerView AYXKKw;
    public StateListAnimator AhwBna;
    public android.widget.TextView AkhnZx;
    public android.widget.TextView AuCTel;
    public TemplateSetting DbNXlk;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public java.util.ArrayList<MarketTypeSelect> djBIcL;
    public android.widget.TextView ejfBZ;
    public android.widget.TextView fARcdN;
    public android.widget.TextView fIwbmz;
    public android.widget.TextView fJNWhG;
    public android.widget.TextView fetchVPNInfo;
    public Function1<? super MarketTypeSelect, Unit> gEmmrt;
    public android.widget.TextView getFieldNames;
    public java.util.ArrayList<java.lang.Integer> isConnected;
    public boolean valueOf;
    public android.widget.TextView values;

    @Override // o.InterfaceC35970oKl
    public android.view.View OLrzqt() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35970oKl
    public void setOnItemSelectListener(@NotNull Function1<? super MarketTypeSelect, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39756pyO(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = true;
        this.KWHzl = true;
        this.copydefault = true;
        this.EZpvd = true;
        this.valueOf = true;
        this.djBIcL = new java.util.ArrayList<>();
        this.isConnected = new java.util.ArrayList<>();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39756pyO(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.AEQbTJ = true;
        this.KWHzl = true;
        this.copydefault = true;
        this.EZpvd = true;
        this.valueOf = true;
        this.djBIcL = new java.util.ArrayList<>();
        this.isConnected = new java.util.ArrayList<>();
        KWHzl(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39756pyO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = true;
        this.KWHzl = true;
        this.copydefault = true;
        this.EZpvd = true;
        this.valueOf = true;
        this.djBIcL = new java.util.ArrayList<>();
        this.isConnected = new java.util.ArrayList<>();
        KWHzl(context, attributeSet);
    }

    public final void KWHzl(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35964oKf.PendingIntent.fetchVPNInfo);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.AEQbTJ = typedArrayObtainStyledAttributes.getBoolean(C35964oKf.PendingIntent.values, true);
            this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C35964oKf.PendingIntent.AkhnZx, false);
            typedArrayObtainStyledAttributes.recycle();
            AEQbTJ(context);
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void AEQbTJ(android.content.Context context) {
        android.view.View viewInflate;
        if (this.AEQbTJ) {
            viewInflate = android.view.LayoutInflater.from(context).inflate(C35964oKf.Application.UccSpe, this);
        } else {
            viewInflate = android.view.LayoutInflater.from(context).inflate(C35964oKf.Application.ggKfIT, this);
        }
        this.getFieldNames = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OsDdEf);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DRtzUu);
        this.fARcdN = textView;
        if (textView != null) {
            textView.setSelected(true);
        }
        this.AkhnZx = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.zMXLsR);
        this.fetchVPNInfo = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.Slwtri);
        this.fJNWhG = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DDxOgT);
        this.ejfBZ = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DHEdFZ);
        this.fIwbmz = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DRuYWY);
        this.values = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.UPbYzn);
        this.AuCTel = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QWSkGZ);
        this.AYXKKw = (RecyclerView) viewInflate.findViewById(C35964oKf.StateListAnimator.zEkrwr);
        android.widget.TextView textView2 = this.getFieldNames;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.pyV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39756pyO.values(this.KWHzl, view);
                }
            });
        }
        android.widget.TextView textView3 = this.fARcdN;
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o.pyT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39756pyO.fetchVPNInfo(this.AEQbTJ, view);
                }
            });
        }
        android.widget.TextView textView4 = this.AkhnZx;
        if (textView4 != null) {
            textView4.setOnClickListener(new View.OnClickListener() { // from class: o.pyR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39756pyO.fJNWhG(this.KWHzl, view);
                }
            });
        }
        android.widget.TextView textView5 = this.fetchVPNInfo;
        if (textView5 != null) {
            textView5.setOnClickListener(new View.OnClickListener() { // from class: o.pyY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39756pyO.AuCTel(this.copydefault, view);
                }
            });
        }
        android.widget.TextView textView6 = this.fJNWhG;
        if (textView6 != null) {
            textView6.setOnClickListener(new View.OnClickListener() { // from class: o.pza
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39756pyO.ejfBZ(this.copydefault, view);
                }
            });
        }
        if (this.OLrzqt) {
            valueOf();
        }
        KWHzl();
        copydefault();
        AYXKKw();
        djBIcL();
        AEQbTJ();
        AhwBna();
    }

    public static final void values(C39756pyO c39756pyO, android.view.View view) {
        c39756pyO.copydefault("VOLUME");
        c39756pyO.EZpvd();
        Function1<? super MarketTypeSelect, Unit> function1 = c39756pyO.gEmmrt;
        if (function1 != null) {
            android.widget.TextView textView = c39756pyO.getFieldNames;
            function1.invoke(new MarketTypeSelect("VOLUME", textView != null ? textView.isSelected() : false, 0, null, 8, null));
        }
    }

    public static final void fetchVPNInfo(C39756pyO c39756pyO, android.view.View view) {
        c39756pyO.copydefault("MA");
        c39756pyO.EZpvd();
        Function1<? super MarketTypeSelect, Unit> function1 = c39756pyO.gEmmrt;
        if (function1 != null) {
            android.widget.TextView textView = c39756pyO.fARcdN;
            function1.invoke(new MarketTypeSelect("MA", textView != null ? textView.isSelected() : false, 0, null, 8, null));
        }
    }

    public static final void fJNWhG(C39756pyO c39756pyO, android.view.View view) {
        c39756pyO.copydefault("EMA");
        c39756pyO.EZpvd();
        Function1<? super MarketTypeSelect, Unit> function1 = c39756pyO.gEmmrt;
        if (function1 != null) {
            android.widget.TextView textView = c39756pyO.AkhnZx;
            function1.invoke(new MarketTypeSelect("EMA", textView != null ? textView.isSelected() : false, 0, null, 8, null));
        }
    }

    public static final void AuCTel(C39756pyO c39756pyO, android.view.View view) {
        c39756pyO.copydefault("BOLL");
        c39756pyO.EZpvd();
        Function1<? super MarketTypeSelect, Unit> function1 = c39756pyO.gEmmrt;
        if (function1 != null) {
            android.widget.TextView textView = c39756pyO.fetchVPNInfo;
            function1.invoke(new MarketTypeSelect("BOLL", textView != null ? textView.isSelected() : false, 0, null, 8, null));
        }
    }

    public static final void ejfBZ(C39756pyO c39756pyO, android.view.View view) {
        c39756pyO.copydefault("SAR");
        c39756pyO.EZpvd();
        Function1<? super MarketTypeSelect, Unit> function1 = c39756pyO.gEmmrt;
        if (function1 != null) {
            android.widget.TextView textView = c39756pyO.fJNWhG;
            function1.invoke(new MarketTypeSelect("SAR", textView != null ? textView.isSelected() : false, 0, null, 8, null));
        }
    }

    public final void AhwBna() {
        boolean z = this.valueOf && pFS.KWHzl.gEmmrt();
        android.widget.TextView textView = this.AuCTel;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        android.widget.TextView textView2 = this.AuCTel;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.pyM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39756pyO.isConnected(this.EZpvd, view);
                }
            });
        }
    }

    public static final void isConnected(C39756pyO c39756pyO, android.view.View view) {
        c39756pyO.copydefault("VWAP");
        c39756pyO.EZpvd();
        Function1<? super MarketTypeSelect, Unit> function1 = c39756pyO.gEmmrt;
        if (function1 != null) {
            android.widget.TextView textView = c39756pyO.AuCTel;
            function1.invoke(new MarketTypeSelect("VWAP", textView != null ? textView.isSelected() : false, 0, null, 8, null));
        }
    }

    public final void AYXKKw() {
        TemplateSetting templateSetting;
        java.util.ArrayList<java.lang.String> mainIndicatorNames;
        TemplateSetting templateSetting2;
        boolean z = this.KWHzl && pFS.KWHzl.valueOf();
        android.widget.TextView textView = this.ejfBZ;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        if (!z && (templateSetting = this.DbNXlk) != null && (mainIndicatorNames = templateSetting.getMainIndicatorNames()) != null && mainIndicatorNames.contains("SR") && (templateSetting2 = this.DbNXlk) != null) {
            templateSetting2.removeMainIndicatorName("SR");
        }
        android.widget.TextView textView2 = this.ejfBZ;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.pyX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39756pyO.AkhnZx(this.KWHzl, view);
                }
            });
        }
    }

    public static final void AkhnZx(C39756pyO c39756pyO, android.view.View view) {
        c39756pyO.copydefault("SR");
        c39756pyO.EZpvd();
        Function1<? super MarketTypeSelect, Unit> function1 = c39756pyO.gEmmrt;
        if (function1 != null) {
            android.widget.TextView textView = c39756pyO.ejfBZ;
            function1.invoke(new MarketTypeSelect("SR", textView != null ? textView.isSelected() : false, 0, null, 8, null));
        }
    }

    public final void djBIcL() {
        boolean z = this.copydefault && pFS.KWHzl.djBIcL();
        android.widget.TextView textView = this.fIwbmz;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        android.widget.TextView textView2 = this.fIwbmz;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.pyU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39756pyO.DbNXlk(this.EZpvd, view);
                }
            });
        }
    }

    public static final void DbNXlk(C39756pyO c39756pyO, android.view.View view) {
        c39756pyO.copydefault("SUPERTREND");
        c39756pyO.EZpvd();
        Function1<? super MarketTypeSelect, Unit> function1 = c39756pyO.gEmmrt;
        if (function1 != null) {
            android.widget.TextView textView = c39756pyO.fIwbmz;
            function1.invoke(new MarketTypeSelect("SUPERTREND", textView != null ? textView.isSelected() : false, 0, null, 8, null));
        }
    }

    public final void AEQbTJ() {
        boolean z = this.EZpvd && pFS.KWHzl.KWHzl();
        android.widget.TextView textView = this.values;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        android.widget.TextView textView2 = this.values;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.pyS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39756pyO.valueOf(this.EZpvd, view);
                }
            });
        }
    }

    public static final void valueOf(C39756pyO c39756pyO, android.view.View view) {
        c39756pyO.copydefault("ENVELOPE");
        c39756pyO.EZpvd();
        Function1<? super MarketTypeSelect, Unit> function1 = c39756pyO.gEmmrt;
        if (function1 != null) {
            android.widget.TextView textView = c39756pyO.values;
            function1.invoke(new MarketTypeSelect("ENVELOPE", textView != null ? textView.isSelected() : false, 0, null, 8, null));
        }
    }

    public final void valueOf() {
        android.widget.TextView textView = this.fARcdN;
        if (textView != null) {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
        android.widget.TextView textView2 = this.AkhnZx;
        if (textView2 != null) {
            textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
        android.widget.TextView textView3 = this.fetchVPNInfo;
        if (textView3 != null) {
            textView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
        android.widget.TextView textView4 = this.fJNWhG;
        if (textView4 != null) {
            textView4.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
        android.widget.TextView textView5 = this.ejfBZ;
        if (textView5 != null) {
            textView5.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
        android.widget.TextView textView6 = this.fIwbmz;
        if (textView6 != null) {
            textView6.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
        android.widget.TextView textView7 = this.values;
        if (textView7 != null) {
            textView7.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
        android.widget.TextView textView8 = this.AuCTel;
        if (textView8 != null) {
            textView8.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
    }

    public final void KWHzl() {
        this.DbNXlk = C36246oUr.copydefault().KWHzl("ds0");
        java.util.ArrayList<MarketTypeSelect> arrayList = this.djBIcL;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (this.OLrzqt) {
            android.widget.TextView textView = this.getFieldNames;
            if (textView != null) {
                textView.setVisibility(8);
            }
            java.util.ArrayList<MarketTypeSelect> arrayList2 = this.djBIcL;
            if (arrayList2 != null) {
                arrayList2.add(new MarketTypeSelect("VOLUME", false, 1, null, 8, null));
            }
            java.util.ArrayList<MarketTypeSelect> arrayList3 = this.djBIcL;
            if (arrayList3 != null) {
                arrayList3.add(new MarketTypeSelect("MACD", false, 1, null, 8, null));
            }
            java.util.ArrayList<MarketTypeSelect> arrayList4 = this.djBIcL;
            if (arrayList4 != null) {
                arrayList4.add(new MarketTypeSelect("KDJ", false, 1, null, 8, null));
            }
            java.util.ArrayList<MarketTypeSelect> arrayList5 = this.djBIcL;
            if (arrayList5 != null) {
                arrayList5.add(new MarketTypeSelect("RSI", false, 1, null, 8, null));
                return;
            }
            return;
        }
        java.util.ArrayList<MarketTypeSelect> arrayList6 = this.djBIcL;
        if (arrayList6 != null) {
            arrayList6.add(new MarketTypeSelect("VOLUME", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList7 = this.djBIcL;
        if (arrayList7 != null) {
            arrayList7.add(new MarketTypeSelect("MACD", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList8 = this.djBIcL;
        if (arrayList8 != null) {
            arrayList8.add(new MarketTypeSelect("KDJ", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList9 = this.djBIcL;
        if (arrayList9 != null) {
            arrayList9.add(new MarketTypeSelect("SKDJ", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList10 = this.djBIcL;
        if (arrayList10 != null) {
            arrayList10.add(new MarketTypeSelect("BOLL", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList11 = this.djBIcL;
        if (arrayList11 != null) {
            arrayList11.add(new MarketTypeSelect("RSI", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList12 = this.djBIcL;
        if (arrayList12 != null) {
            arrayList12.add(new MarketTypeSelect("StochRSI", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList13 = this.djBIcL;
        if (arrayList13 != null) {
            arrayList13.add(new MarketTypeSelect("OBV", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList14 = this.djBIcL;
        if (arrayList14 != null) {
            arrayList14.add(new MarketTypeSelect("SAR", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList15 = this.djBIcL;
        if (arrayList15 != null) {
            arrayList15.add(new MarketTypeSelect("DMA", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList16 = this.djBIcL;
        if (arrayList16 != null) {
            arrayList16.add(new MarketTypeSelect("TRIX", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList17 = this.djBIcL;
        if (arrayList17 != null) {
            arrayList17.add(new MarketTypeSelect("VR", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList18 = this.djBIcL;
        if (arrayList18 != null) {
            arrayList18.add(new MarketTypeSelect("BRAR", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList19 = this.djBIcL;
        if (arrayList19 != null) {
            arrayList19.add(new MarketTypeSelect("EMV", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList20 = this.djBIcL;
        if (arrayList20 != null) {
            arrayList20.add(new MarketTypeSelect("WR", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList21 = this.djBIcL;
        if (arrayList21 != null) {
            arrayList21.add(new MarketTypeSelect("ROC", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList22 = this.djBIcL;
        if (arrayList22 != null) {
            arrayList22.add(new MarketTypeSelect("MTM", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList23 = this.djBIcL;
        if (arrayList23 != null) {
            arrayList23.add(new MarketTypeSelect("PSY", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList24 = this.djBIcL;
        if (arrayList24 != null) {
            arrayList24.add(new MarketTypeSelect("DMI", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList25 = this.djBIcL;
        if (arrayList25 != null) {
            arrayList25.add(new MarketTypeSelect("CCI", false, 1, null, 8, null));
        }
    }

    public final void copydefault() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        if (this.AEQbTJ) {
            linearLayoutManager.setOrientation(0);
        } else {
            linearLayoutManager.setOrientation(1);
        }
        RecyclerView recyclerView = this.AYXKKw;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.AhwBna = stateListAnimator;
        RecyclerView recyclerView2 = this.AYXKKw;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(stateListAnimator);
        }
    }

    public final void EZpvd() {
        java.util.ArrayList<java.lang.String> mainIndicatorNames;
        java.util.ArrayList<java.lang.String> mainIndicatorNames2;
        java.util.ArrayList<java.lang.String> mainIndicatorNames3;
        java.util.ArrayList<java.lang.String> mainIndicatorNames4;
        boolean zContains;
        java.util.ArrayList<java.lang.String> mainIndicatorNames5;
        boolean zContains2;
        java.util.ArrayList<java.lang.String> mainIndicatorNames6;
        boolean zContains3;
        java.util.ArrayList<java.lang.String> mainIndicatorNames7;
        boolean zContains4;
        java.util.ArrayList<java.lang.String> mainIndicatorNames8;
        java.util.ArrayList<java.lang.String> mainIndicatorNames9;
        android.widget.TextView textView = this.getFieldNames;
        boolean zContains5 = false;
        if (textView != null) {
            TemplateSetting templateSetting = this.DbNXlk;
            textView.setSelected((templateSetting == null || (mainIndicatorNames9 = templateSetting.getMainIndicatorNames()) == null) ? false : mainIndicatorNames9.contains("VOLUME"));
        }
        android.widget.TextView textView2 = this.fARcdN;
        if (textView2 != null) {
            TemplateSetting templateSetting2 = this.DbNXlk;
            if (templateSetting2 == null || (mainIndicatorNames8 = templateSetting2.getMainIndicatorNames()) == null) {
                zContains4 = false;
            } else {
                android.widget.TextView textView3 = this.fARcdN;
                zContains4 = mainIndicatorNames8.contains(C33129mqd.gEmmrt(textView3 != null ? textView3.getText() : null));
            }
            textView2.setSelected(zContains4);
        }
        android.widget.TextView textView4 = this.fetchVPNInfo;
        if (textView4 != null) {
            TemplateSetting templateSetting3 = this.DbNXlk;
            if (templateSetting3 == null || (mainIndicatorNames7 = templateSetting3.getMainIndicatorNames()) == null) {
                zContains3 = false;
            } else {
                android.widget.TextView textView5 = this.fetchVPNInfo;
                zContains3 = mainIndicatorNames7.contains(C33129mqd.gEmmrt(textView5 != null ? textView5.getText() : null));
            }
            textView4.setSelected(zContains3);
        }
        android.widget.TextView textView6 = this.AkhnZx;
        if (textView6 != null) {
            TemplateSetting templateSetting4 = this.DbNXlk;
            if (templateSetting4 == null || (mainIndicatorNames6 = templateSetting4.getMainIndicatorNames()) == null) {
                zContains2 = false;
            } else {
                android.widget.TextView textView7 = this.AkhnZx;
                zContains2 = mainIndicatorNames6.contains(C33129mqd.gEmmrt(textView7 != null ? textView7.getText() : null));
            }
            textView6.setSelected(zContains2);
        }
        android.widget.TextView textView8 = this.fJNWhG;
        if (textView8 != null) {
            TemplateSetting templateSetting5 = this.DbNXlk;
            if (templateSetting5 == null || (mainIndicatorNames5 = templateSetting5.getMainIndicatorNames()) == null) {
                zContains = false;
            } else {
                android.widget.TextView textView9 = this.fJNWhG;
                zContains = mainIndicatorNames5.contains(C33129mqd.gEmmrt(textView9 != null ? textView9.getText() : null));
            }
            textView8.setSelected(zContains);
        }
        android.widget.TextView textView10 = this.ejfBZ;
        if (textView10 != null) {
            TemplateSetting templateSetting6 = this.DbNXlk;
            textView10.setSelected((templateSetting6 == null || (mainIndicatorNames4 = templateSetting6.getMainIndicatorNames()) == null) ? false : mainIndicatorNames4.contains("SR"));
        }
        android.widget.TextView textView11 = this.fIwbmz;
        if (textView11 != null) {
            TemplateSetting templateSetting7 = this.DbNXlk;
            textView11.setSelected((templateSetting7 == null || (mainIndicatorNames3 = templateSetting7.getMainIndicatorNames()) == null) ? false : mainIndicatorNames3.contains("SUPERTREND"));
        }
        android.widget.TextView textView12 = this.values;
        if (textView12 != null) {
            TemplateSetting templateSetting8 = this.DbNXlk;
            textView12.setSelected((templateSetting8 == null || (mainIndicatorNames2 = templateSetting8.getMainIndicatorNames()) == null) ? false : mainIndicatorNames2.contains("ENVELOPE"));
        }
        android.widget.TextView textView13 = this.AuCTel;
        if (textView13 != null) {
            TemplateSetting templateSetting9 = this.DbNXlk;
            if (templateSetting9 != null && (mainIndicatorNames = templateSetting9.getMainIndicatorNames()) != null) {
                zContains5 = mainIndicatorNames.contains("VWAP");
            }
            textView13.setSelected(zContains5);
        }
        if (this.OLrzqt) {
            android.widget.TextView textView14 = this.fARcdN;
            if (textView14 != null) {
                textView14.setTypeface(textView14.isSelected() ? C55051xce.OLrzqt.AEQbTJ() : C55051xce.OLrzqt.valueOf());
                textView14.setTextColor(C33070mpX.copydefault(textView14.isSelected() ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.DCUTEIddSDPG));
            }
            android.widget.TextView textView15 = this.AkhnZx;
            if (textView15 != null) {
                textView15.setTypeface(textView15.isSelected() ? C55051xce.OLrzqt.AEQbTJ() : C55051xce.OLrzqt.valueOf());
                textView15.setTextColor(C33070mpX.copydefault(textView15.isSelected() ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.DCUTEIddSDPG));
            }
            android.widget.TextView textView16 = this.fetchVPNInfo;
            if (textView16 != null) {
                textView16.setTypeface(textView16.isSelected() ? C55051xce.OLrzqt.AEQbTJ() : C55051xce.OLrzqt.valueOf());
                textView16.setTextColor(C33070mpX.copydefault(textView16.isSelected() ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.DCUTEIddSDPG));
            }
            android.widget.TextView textView17 = this.fJNWhG;
            if (textView17 != null) {
                textView17.setTypeface(textView17.isSelected() ? C55051xce.OLrzqt.AEQbTJ() : C55051xce.OLrzqt.valueOf());
                textView17.setTextColor(C33070mpX.copydefault(textView17.isSelected() ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.DCUTEIddSDPG));
            }
            android.widget.TextView textView18 = this.ejfBZ;
            if (textView18 != null) {
                textView18.setTypeface(textView18.isSelected() ? C55051xce.OLrzqt.AEQbTJ() : C55051xce.OLrzqt.valueOf());
                textView18.setTextColor(C33070mpX.copydefault(textView18.isSelected() ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.DCUTEIddSDPG));
            }
            android.widget.TextView textView19 = this.fIwbmz;
            if (textView19 != null) {
                textView19.setTypeface(textView19.isSelected() ? C55051xce.OLrzqt.AEQbTJ() : C55051xce.OLrzqt.valueOf());
                textView19.setTextColor(C33070mpX.copydefault(textView19.isSelected() ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.DCUTEIddSDPG));
            }
            android.widget.TextView textView20 = this.values;
            if (textView20 != null) {
                textView20.setTypeface(textView20.isSelected() ? C55051xce.OLrzqt.AEQbTJ() : C55051xce.OLrzqt.valueOf());
                textView20.setTextColor(C33070mpX.copydefault(textView20.isSelected() ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.DCUTEIddSDPG));
            }
            android.widget.TextView textView21 = this.AuCTel;
            if (textView21 != null) {
                textView21.setTypeface(textView21.isSelected() ? C55051xce.OLrzqt.AEQbTJ() : C55051xce.OLrzqt.valueOf());
                textView21.setTextColor(C33070mpX.copydefault(textView21.isSelected() ? C52761wXj.Activity.DeEinT : C52761wXj.Activity.DCUTEIddSDPG));
            }
        }
    }

    /* JADX INFO: renamed from: o.pyO$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.Adapter<Activity> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (C39756pyO.this.AEQbTJ) {
                if (C39756pyO.this.OLrzqt) {
                    android.view.View viewInflate = android.view.LayoutInflater.from(C39756pyO.this.getContext()).inflate(C35964oKf.Application.QHmsKR, viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(viewInflate, "");
                    return new Activity(viewInflate);
                }
                android.view.View viewInflate2 = android.view.LayoutInflater.from(C39756pyO.this.getContext()).inflate(C35964oKf.Application.OBJEWx, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate2, "");
                return new Activity(viewInflate2);
            }
            android.view.View viewInflate3 = android.view.LayoutInflater.from(C39756pyO.this.getContext()).inflate(C35964oKf.Application.RKDWNf, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "");
            return new Activity(viewInflate3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            java.util.ArrayList arrayList = C39756pyO.this.djBIcL;
            java.lang.Integer numValueOf = arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null;
            Intrinsics.copydefault(numValueOf);
            return numValueOf.intValue();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull Activity activity, final int i) {
            MarketTypeSelect marketTypeSelect;
            MarketTypeSelect marketTypeSelect2;
            java.lang.String selectTypeName;
            Intrinsics.checkNotNullParameter(activity, "");
            java.util.ArrayList arrayList = C39756pyO.this.djBIcL;
            if (arrayList != null && (marketTypeSelect2 = (MarketTypeSelect) arrayList.get(i)) != null && (selectTypeName = marketTypeSelect2.getSelectTypeName()) != null) {
                activity.EZpvd().setText(Intrinsics.EZpvd((java.lang.Object) selectTypeName, (java.lang.Object) "VOLUME") ? "VOL" : C37979pHu.AEQbTJ.OLrzqt(selectTypeName));
            }
            android.widget.TextView textViewEZpvd = activity.EZpvd();
            java.util.ArrayList arrayList2 = C39756pyO.this.djBIcL;
            java.lang.Boolean boolValueOf = (arrayList2 == null || (marketTypeSelect = (MarketTypeSelect) arrayList2.get(i)) == null) ? null : java.lang.Boolean.valueOf(marketTypeSelect.isSelect());
            Intrinsics.copydefault(boolValueOf);
            textViewEZpvd.setSelected(boolValueOf.booleanValue());
            if (C39756pyO.this.OLrzqt) {
                activity.EZpvd().setTypeface(activity.EZpvd().isSelected() ? C55051xce.OLrzqt.AEQbTJ() : C55051xce.OLrzqt.valueOf());
            }
            if (!C39756pyO.this.AEQbTJ) {
                if (C39756pyO.this.AEQbTJ) {
                    activity.EZpvd().setPadding((int) C39756pyO.this.getResources().getDimension(C52761wXj.StateListAnimator.fFgQHt), 0, 0, 0);
                } else {
                    activity.EZpvd().setPadding(0, 0, 0, 0);
                }
            } else {
                java.util.ArrayList arrayList3 = C39756pyO.this.djBIcL;
                Intrinsics.copydefault(arrayList3 != null ? java.lang.Integer.valueOf(arrayList3.size()) : null);
                if (i == r2.intValue() - 1) {
                    activity.EZpvd().setPadding((int) C39756pyO.this.getResources().getDimension(C52761wXj.StateListAnimator.fFgQHt), 0, (int) C39756pyO.this.getResources().getDimension(C52761wXj.StateListAnimator.giSNqX), 0);
                }
            }
            android.view.View view = activity.itemView;
            final C39756pyO c39756pyO = C39756pyO.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.pyZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C39756pyO.StateListAnimator.KWHzl(c39756pyO, i, this, view2);
                }
            });
        }

        public static final void KWHzl(C39756pyO c39756pyO, int i, StateListAnimator stateListAnimator, android.view.View view) {
            MarketTypeSelect marketTypeSelect;
            java.util.ArrayList arrayList = c39756pyO.djBIcL;
            if (arrayList != null && (marketTypeSelect = (MarketTypeSelect) arrayList.get(i)) != null) {
                if (!marketTypeSelect.isSelect()) {
                    if (c39756pyO.isConnected.size() == 4) {
                        java.util.ArrayList arrayList2 = c39756pyO.djBIcL;
                        if (arrayList2 != null) {
                            java.lang.Object obj = c39756pyO.isConnected.get(0);
                            Intrinsics.checkNotNullExpressionValue(obj, "");
                            MarketTypeSelect marketTypeSelect2 = (MarketTypeSelect) arrayList2.get(((java.lang.Number) obj).intValue());
                            if (marketTypeSelect2 != null) {
                                marketTypeSelect2.setSelect(false);
                            }
                        }
                        c39756pyO.isConnected.remove(0);
                    }
                    c39756pyO.isConnected.add(java.lang.Integer.valueOf(i));
                } else {
                    c39756pyO.isConnected.remove(java.lang.Integer.valueOf(i));
                }
                marketTypeSelect.setSelect(!marketTypeSelect.isSelect());
            }
            stateListAnimator.notifyDataSetChanged();
            Function1 function1 = c39756pyO.gEmmrt;
            if (function1 != null) {
                java.util.ArrayList arrayList3 = c39756pyO.djBIcL;
                MarketTypeSelect marketTypeSelect3 = arrayList3 != null ? (MarketTypeSelect) arrayList3.get(i) : null;
                Intrinsics.copydefault(marketTypeSelect3);
                function1.invoke(marketTypeSelect3);
            }
        }
    }

    /* JADX INFO: renamed from: o.pyO$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final android.widget.TextView EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.Srftgn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById;
        }
    }

    @Override // o.InterfaceC35970oKl
    public void setMainIndicatorSelect() {
        gEmmrt();
        EZpvd();
    }

    @Override // o.InterfaceC35970oKl
    public void setSideIndicators(@NotNull java.util.List<java.lang.String> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        gEmmrt();
        java.util.ArrayList<java.lang.Integer> arrayList = this.isConnected;
        if (arrayList != null) {
            arrayList.clear();
        }
        java.util.ArrayList<MarketTypeSelect> arrayList2 = this.djBIcL;
        if (arrayList2 != null) {
            int i = 0;
            for (java.lang.Object obj : arrayList2) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                MarketTypeSelect marketTypeSelect = (MarketTypeSelect) obj;
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.EZpvd(next, (java.lang.Object) marketTypeSelect.getSelectTypeName())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                marketTypeSelect.setSelect(next != null);
                if (marketTypeSelect.isSelect()) {
                    this.isConnected.add(java.lang.Integer.valueOf(i));
                }
                i++;
            }
        }
        StateListAnimator stateListAnimator = this.AhwBna;
        if (stateListAnimator != null) {
            stateListAnimator.notifyDataSetChanged();
        }
    }

    @Override // o.InterfaceC35970oKl
    public void setSideIndicator(@NotNull java.lang.String str) {
        MarketTypeSelect marketTypeSelect;
        MarketTypeSelect marketTypeSelect2;
        MarketTypeSelect marketTypeSelect3;
        MarketTypeSelect marketTypeSelect4;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<MarketTypeSelect> arrayList = this.djBIcL;
        java.lang.Integer numValueOf = arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null;
        Intrinsics.copydefault(numValueOf);
        int iIntValue = numValueOf.intValue();
        for (int i = 0; i < iIntValue; i++) {
            java.util.ArrayList<MarketTypeSelect> arrayList2 = this.djBIcL;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((arrayList2 == null || (marketTypeSelect4 = arrayList2.get(i)) == null) ? null : marketTypeSelect4.getSelectTypeName()))) {
                java.util.ArrayList<MarketTypeSelect> arrayList3 = this.djBIcL;
                if (arrayList3 != null && (marketTypeSelect2 = arrayList3.get(i)) != null) {
                    java.util.ArrayList<MarketTypeSelect> arrayList4 = this.djBIcL;
                    marketTypeSelect2.setSelect(!((arrayList4 == null || (marketTypeSelect3 = arrayList4.get(i)) == null) ? false : marketTypeSelect3.isSelect()));
                }
            } else {
                java.util.ArrayList<MarketTypeSelect> arrayList5 = this.djBIcL;
                if (arrayList5 != null && (marketTypeSelect = arrayList5.get(i)) != null) {
                    marketTypeSelect.setSelect(false);
                }
            }
        }
        StateListAnimator stateListAnimator = this.AhwBna;
        if (stateListAnimator != null) {
            stateListAnimator.notifyDataSetChanged();
        }
    }

    @Override // o.InterfaceC35970oKl
    public void setIsProfit(boolean z) {
        this.AEQbTJ = z;
        if (getContext() == null) {
            return;
        }
        removeAllViews();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AEQbTJ(context);
    }

    @Override // o.InterfaceC35970oKl
    public void setIsShowSRIndicator(boolean z) {
        this.KWHzl = z;
        AYXKKw();
    }

    @Override // o.InterfaceC35970oKl
    public void setIsShowSTIndicator(boolean z) {
        this.copydefault = z;
        djBIcL();
    }

    @Override // o.InterfaceC35970oKl
    public void setIsShowEnvelopeIndicator(boolean z) {
        this.EZpvd = z;
        AEQbTJ();
    }

    @Override // o.InterfaceC35970oKl
    public void setIsShowVWAPIndicator(boolean z) {
        this.valueOf = z;
        AhwBna();
    }

    public final void copydefault(java.lang.String str) {
        java.util.ArrayList<java.lang.String> mainIndicatorNames;
        TemplateSetting templateSetting = this.DbNXlk;
        if (templateSetting == null || (mainIndicatorNames = templateSetting.getMainIndicatorNames()) == null || !mainIndicatorNames.contains(str)) {
            TemplateSetting templateSetting2 = this.DbNXlk;
            if (templateSetting2 != null) {
                templateSetting2.addMainIndicatorName(str);
                return;
            }
            return;
        }
        TemplateSetting templateSetting3 = this.DbNXlk;
        if (templateSetting3 != null) {
            templateSetting3.removeMainIndicatorName(str);
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<MarketTypeSelect> arrayList = this.djBIcL;
        if (arrayList != null) {
            arrayList.add(new MarketTypeSelect("OI", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList2 = this.djBIcL;
        if (arrayList2 != null) {
            arrayList2.add(new MarketTypeSelect("LSAcco", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList3 = this.djBIcL;
        if (arrayList3 != null) {
            arrayList3.add(new MarketTypeSelect("LSPos", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList4 = this.djBIcL;
        if (arrayList4 != null) {
            arrayList4.add(new MarketTypeSelect("LSRatio", false, 1, null, 8, null));
        }
        java.util.ArrayList<MarketTypeSelect> arrayList5 = this.djBIcL;
        if (arrayList5 != null) {
            arrayList5.add(new MarketTypeSelect("BSVol", false, 1, null, 8, null));
        }
        StateListAnimator stateListAnimator = this.AhwBna;
        if (stateListAnimator != null) {
            stateListAnimator.notifyDataSetChanged();
        }
    }

    public final void gEmmrt() {
        this.DbNXlk = C36246oUr.copydefault().KWHzl("ds0");
    }
}
