package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.dexlogic.bean.DexQuoteInfo;
import com.okinc.business.dexui.main.swap.route.SmartRoutingListFragment$initView$1$2;
import com.okinc.rxutils.SubHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C24441idr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.idr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24441idr extends AbstractC24351icG {
    public Function0<Unit> AhwBna;
    public C21503hBu djBIcL;
    public Function0<Unit> valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.idz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24441idr.isConnected();
        }
    });

    /* JADX INFO: renamed from: o.idr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.idr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C24441idr copydefault(@NotNull java.lang.String str, @NotNull java.util.ArrayList<DexQuoteInfo> arrayList, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            C24441idr c24441idr = new C24441idr();
            c24441idr.AhwBna = function0;
            c24441idr.valueOf = function02;
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putSerializable("data", arrayList);
            bundle.putString("fromTitle", str2);
            bundle.putString("toTitle", str3);
            bundle.putInt("route_height", i);
            c24441idr.setArguments(bundle);
            return c24441idr;
        }
    }

    private final C43316rmw AYXKKw() {
        return (C43316rmw) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    @Override // o.AbstractC24351icG
    public void OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.djBIcL = C21503hBu.OLrzqt(layoutInflater, viewGroup, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        djBIcL();
        gEmmrt();
        AhwBna();
        view.post(new java.lang.Runnable() { // from class: o.idA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24441idr.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final void AEQbTJ(C24441idr c24441idr) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c24441idr, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        wXQ wxqKWHzl = KWHzl();
        if (wxqKWHzl != null) {
            wxqKWHzl.EZpvd().setContentDescription("web3_dex_swap_provider_sub_route_back_button");
            wxqKWHzl.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.idx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24441idr.KWHzl(this.AEQbTJ, view);
                }
            });
            wxqKWHzl.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.idy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C24441idr.AEQbTJ(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void KWHzl(C24441idr c24441idr, android.view.View view) {
        Function0<Unit> function0 = c24441idr.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void AEQbTJ(C24441idr c24441idr, android.view.View view) {
        Function0<Unit> function0 = c24441idr.valueOf;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void djBIcL() {
        RecyclerView recyclerView;
        C21503hBu c21503hBu = this.djBIcL;
        if (c21503hBu == null || (recyclerView = c21503hBu.KWHzl) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(AYXKKw());
        AYXKKw().register(DexQuoteInfo.class, new Activity(SmartRoutingListFragment$initView$1$2.INSTANCE));
    }

    /* JADX INFO: renamed from: o.idr$Activity */
    public static final class Activity extends AbstractC25436iwg<DexQuoteInfo, hBA> {
        public Activity(SmartRoutingListFragment$initView$1$2 smartRoutingListFragment$initView$1$2) {
            super(smartRoutingListFragment$initView$1$2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C25435iwf<hBA> c25435iwf, final DexQuoteInfo dexQuoteInfo) {
            Intrinsics.checkNotNullParameter(c25435iwf, "");
            Intrinsics.checkNotNullParameter(dexQuoteInfo, "");
            ViewBinding viewBindingEZpvd = c25435iwf.EZpvd();
            final C24441idr c24441idr = C24441idr.this;
            hBA hba = (hBA) viewBindingEZpvd;
            hba.copydefault.setText(dexQuoteInfo.getDexShowName());
            hba.KWHzl.setText(C23311hvo.formatPercent$default(dexQuoteInfo.getPercent(), false, 0, 0, null, null, 30, null));
            hba.EZpvd.setVisibility(dexQuoteInfo.getOkLinkUrl().length() == 0 ? 8 : 0);
            C25352ivB.setOnDoubleCheckClickListener$default(hba.OLrzqt, 0L, new Function1() { // from class: o.idw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24441idr.Activity.OLrzqt(dexQuoteInfo, c24441idr, (android.view.View) obj);
                }
            }, 1, null);
        }

        public static final Unit OLrzqt(DexQuoteInfo dexQuoteInfo, C24441idr c24441idr, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            if (dexQuoteInfo.getOkLinkUrl().length() != 0) {
                c24441idr.copydefault(dexQuoteInfo.getOkLinkUrl());
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    private final void gEmmrt() {
        java.lang.Object serializable;
        wXQ wxqKWHzl = KWHzl();
        if (wxqKWHzl != null) {
            android.widget.TextView textViewAYXKKw = wxqKWHzl.AYXKKw();
            android.os.Bundle arguments = getArguments();
            java.lang.String string = arguments != null ? arguments.getString("fromTitle") : null;
            android.os.Bundle arguments2 = getArguments();
            textViewAYXKKw.setText(OLrzqt(string, arguments2 != null ? arguments2.getString("toTitle") : null));
            android.os.Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments3.getSerializable("data", java.util.ArrayList.class);
                } else {
                    serializable = (java.util.ArrayList) arguments3.getSerializable("data");
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) serializable;
                if (arrayList != null) {
                    AYXKKw().setItems(arrayList);
                }
            }
            android.os.Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                EZpvd(java.lang.Integer.valueOf(arguments4.getInt("route_height")).intValue());
            }
        }
    }

    public final android.text.SpannableStringBuilder OLrzqt(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C55296xhK.OLrzqt(contextRequireContext) ? C23319hvw.OLrzqt(str2) : C23319hvw.OLrzqt(str));
        int i = C23274hvD.ActionBar.AuCTel;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(i, contextRequireContext2);
        Intrinsics.copydefault(drawableEZpvd);
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        int iOLrzqt = C55298xhM.OLrzqt(24, contextRequireContext3);
        android.content.Context contextRequireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
        drawableEZpvd.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(24, contextRequireContext4));
        spannableStringBuilder.append(" ", new mAB(drawableEZpvd, 0, 2, null), 33);
        android.content.Context contextRequireContext5 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
        spannableStringBuilder.append((java.lang.CharSequence) (C55296xhK.OLrzqt(contextRequireContext5) ? C23319hvw.OLrzqt(str) : C23319hvw.OLrzqt(str2)));
        return spannableStringBuilder;
    }

    private final void EZpvd(int i) {
        android.widget.LinearLayout linearLayout;
        C23499hzQ c23499hzQAEQbTJ = AEQbTJ();
        if (c23499hzQAEQbTJ == null || (linearLayout = c23499hzQAEQbTJ.AEQbTJ) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.String str) {
        C25352ivB.KWHzl(getContext(), str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C33050mpD.OLrzqt(this.gEmmrt);
        SubHelper.AEQbTJ(this);
    }
}
