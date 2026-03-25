package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.dapp.net.SelectWalletNotice;
import com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams;
import com.okinc.business.defi.dapp.net.WalletSelectParams;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C15120dyN;
import o.C15170dzK;
import o.C52761wXj;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dzK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15170dzK extends C43318rmy<InterfaceC9735bbG, dMH> {
    public final C15123dyQ AEQbTJ;
    public WalletSelectParams KWHzl;
    public Function1<? super InterfaceC9738bbJ, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C15123dyQ AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.bbJ, kotlin.Unit>, kotlin.jvm.functions.Function1<o.bbJ, kotlin.Unit> */
    public final Function1<InterfaceC9738bbJ, Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSelectParams copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15170dzK(@NotNull C15123dyQ c15123dyQ, @NotNull WalletSelectParams walletSelectParams, Function1<? super InterfaceC9738bbJ, Unit> function1) {
        super(dLX.Fragment.uzCIH, 0);
        Intrinsics.checkNotNullParameter(c15123dyQ, "");
        Intrinsics.checkNotNullParameter(walletSelectParams, "");
        this.AEQbTJ = c15123dyQ;
        this.KWHzl = walletSelectParams;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<dMH> c43312rms, @NotNull InterfaceC9735bbG interfaceC9735bbG) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(interfaceC9735bbG, "");
        ((dMH) c43312rms.OLrzqt()).OLrzqt.setText(interfaceC9735bbG.AEQbTJ(false));
        RecyclerView recyclerView = ((dMH) c43312rms.OLrzqt()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        AEQbTJ(recyclerView);
        RecyclerView.Adapter adapter = ((dMH) c43312rms.OLrzqt()).KWHzl.getAdapter();
        Intrinsics.copydefault(adapter, "");
        C43316rmw c43316rmw = (C43316rmw) adapter;
        c43316rmw.setItems(interfaceC9735bbG.KWHzl());
        c43316rmw.notifyDataSetChanged();
        SelectWalletNotice selectWalletNoticeOLrzqt = C15196dzk.KWHzl.OLrzqt(interfaceC9735bbG, new WeakReference<>(this.AEQbTJ), this.KWHzl.getEnableWithoutBackup());
        dMP dmp = ((dMH) c43312rms.OLrzqt()).copydefault;
        Intrinsics.checkNotNullExpressionValue(dmp, "");
        android.widget.FrameLayout frameLayout = ((dMH) c43312rms.OLrzqt()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        copydefault(dmp, selectWalletNoticeOLrzqt, frameLayout);
    }

    public final void copydefault(dMP dmp, final SelectWalletNotice selectWalletNotice, android.view.View view) {
        if (selectWalletNotice == null || Intrinsics.EZpvd(selectWalletNotice.getWalletEnable(), java.lang.Boolean.TRUE)) {
            view.setVisibility(8);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) selectWalletNotice.getNotice())) {
            view.setVisibility(0);
            dmp.AYXKKw.setText(selectWalletNotice.getNotice());
            dmp.EZpvd.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) selectWalletNotice.getActionText()) ? 0 : 8);
            android.widget.TextView textView = dmp.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55307xhV.AEQbTJ(textView, selectWalletNotice.getActionText());
            if (selectWalletNotice.getAction() != null) {
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(dLX.ActionBar.EZpvd);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setAutoMirrored(true);
                    dmp.OLrzqt.setImageDrawable(drawableKWHzl);
                }
                dmp.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.dzI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C15170dzK.KWHzl(selectWalletNotice, view2);
                    }
                });
                return;
            }
            return;
        }
        view.setVisibility(8);
    }

    public static final void KWHzl(SelectWalletNotice selectWalletNotice, android.view.View view) {
        Function0<Unit> action = selectWalletNotice.getAction();
        if (action != null) {
            action.invoke();
        }
    }

    public final void AEQbTJ(RecyclerView recyclerView) {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.AEQbTJ.getContext(), 1, false));
        C43316rmw c43316rmw = new C43316rmw();
        recyclerView.setAdapter(c43316rmw);
        c43316rmw.register(InterfaceC9738bbJ.class, new StateListAnimator(dLX.Fragment.getNewProxyInstance));
    }

    /* JADX INFO: renamed from: o.dzK$StateListAnimator */
    public static final class StateListAnimator extends C43318rmy<InterfaceC9738bbJ, dMK> {
        public StateListAnimator(int i) {
            super(i, 0);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<dMK> c43312rms, final InterfaceC9738bbJ interfaceC9738bbJ) {
            android.widget.TextView textView;
            android.widget.LinearLayout linearLayout;
            android.widget.TextView textView2;
            android.widget.TextView textView3;
            android.widget.TextView textView4;
            wYC wyc;
            android.widget.LinearLayout linearLayout2;
            wYC wyc2;
            android.widget.TextView textView5;
            android.widget.TextView textView6;
            android.text.TextPaint paint;
            android.widget.LinearLayout linearLayout3;
            android.widget.TextView textView7;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            ((dMK) c43312rms.OLrzqt()).AEQbTJ.setText(interfaceC9738bbJ.AkhnZx());
            FragmentActivity activity = C15170dzK.this.AEQbTJ().getActivity();
            if (activity != null) {
                ComponentCallbacks2C5333Nr componentCallbacks2C5333NrCopydefault = Glide.copydefault(activity);
                java.lang.String strAEQbTJ = interfaceC9738bbJ.AEQbTJ();
                componentCallbacks2C5333NrCopydefault.KWHzl(strAEQbTJ != null ? new wXL(strAEQbTJ, 0, 2, null) : null).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(C33052mpF.AEQbTJ(2, (android.content.Context) activity)))).KWHzl(C52761wXj.Activity.scanPackages).EZpvd(((dMK) c43312rms.OLrzqt()).EZpvd);
            }
            C15196dzk c15196dzk = C15196dzk.KWHzl;
            java.lang.String strKWHzl = c15196dzk.KWHzl(interfaceC9738bbJ, C15170dzK.this.copydefault().getSelectedChain(), C15170dzK.this.copydefault().getSupportChainList());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
                dMK dmk = (dMK) c43312rms.OLrzqt();
                if (dmk != null && (textView7 = dmk.copydefault) != null) {
                    textView7.setVisibility(0);
                }
                dMK dmk2 = (dMK) c43312rms.OLrzqt();
                if (dmk2 != null && (linearLayout3 = dmk2.KWHzl) != null) {
                    linearLayout3.setVisibility(0);
                }
                dMK dmk3 = (dMK) c43312rms.OLrzqt();
                ((dMK) c43312rms.OLrzqt()).AEQbTJ.setMaxWidth(C33129mqd.AhwBna(java.lang.Float.valueOf(((C33570myu.AEQbTJ() - C55298xhM.dp2px$default(167.0f, null, 1, null)) - ((dmk3 == null || (textView6 = dmk3.copydefault) == null || (paint = textView6.getPaint()) == null) ? 0.0f : paint.measureText(strKWHzl))) - (interfaceC9738bbJ.getFieldNames() ? ((dMK) c43312rms.OLrzqt()).OLrzqt.getPaint().measureText(C33070mpX.AYXKKw(dLX.Dialog.flVtFt)) : 0.0f))));
                dMK dmk4 = (dMK) c43312rms.OLrzqt();
                if (dmk4 != null && (textView5 = dmk4.copydefault) != null) {
                    textView5.setText(strKWHzl);
                }
                java.util.List<java.lang.String> contractAddressList = C15170dzK.this.copydefault().getContractAddressList();
                if (contractAddressList == null || contractAddressList.isEmpty()) {
                    dMK dmk5 = (dMK) c43312rms.OLrzqt();
                    if (dmk5 != null && (wyc = dmk5.AhwBna) != null) {
                        wyc.setVisibility(8);
                    }
                } else {
                    dMK dmk6 = (dMK) c43312rms.OLrzqt();
                    if (dmk6 != null && (wyc2 = dmk6.AhwBna) != null) {
                        wyc2.setVisibility(0);
                    }
                    ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
                    Intrinsics.copydefault(viewDataBindingOLrzqt);
                    C15118dyL.EZpvd(((dMK) viewDataBindingOLrzqt).KWHzl, 10, 10, 10, 10);
                    dMK dmk7 = (dMK) c43312rms.OLrzqt();
                    if (dmk7 != null && (linearLayout2 = dmk7.KWHzl) != null) {
                        final C15170dzK c15170dzK = C15170dzK.this;
                        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.dzN
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C15170dzK.StateListAnimator.EZpvd(c15170dzK, interfaceC9738bbJ, view);
                            }
                        });
                    }
                }
            } else {
                dMK dmk8 = (dMK) c43312rms.OLrzqt();
                if (dmk8 != null && (linearLayout = dmk8.KWHzl) != null) {
                    linearLayout.setVisibility(8);
                }
                dMK dmk9 = (dMK) c43312rms.OLrzqt();
                if (dmk9 != null && (textView = dmk9.copydefault) != null) {
                    textView.setVisibility(8);
                }
            }
            java.lang.String contractAddress = C15170dzK.this.copydefault().getContractAddress();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(C15170dzK.this.copydefault().getSelectedChain());
            if (contractAddress != null && C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                java.lang.String strKWHzl2 = c15196dzk.KWHzl(interfaceC9738bbJ, contractAddress, strGEmmrt);
                if (strKWHzl2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl2)) {
                    dMK dmk10 = (dMK) c43312rms.OLrzqt();
                    if (dmk10 != null && (textView3 = dmk10.valueOf) != null) {
                        textView3.setVisibility(8);
                    }
                } else {
                    dMK dmk11 = (dMK) c43312rms.OLrzqt();
                    if (dmk11 != null && (textView4 = dmk11.valueOf) != null) {
                        textView4.setVisibility(0);
                    }
                    ((dMK) c43312rms.OLrzqt()).valueOf.setText(strKWHzl2);
                }
            } else {
                dMK dmk12 = (dMK) c43312rms.OLrzqt();
                if (dmk12 != null && (textView2 = dmk12.valueOf) != null) {
                    textView2.setVisibility(0);
                }
                ((dMK) c43312rms.OLrzqt()).valueOf.setText(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(interfaceC9738bbJ.hDKMBd()));
            }
            if (interfaceC9738bbJ.getFieldNames()) {
                ((dMK) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
                ((dMK) c43312rms.OLrzqt()).OLrzqt.setText(C33070mpX.AYXKKw(dLX.Dialog.flVtFt));
            } else {
                ((dMK) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
            }
            WeakReference<C15123dyQ> weakReference = new WeakReference<>(C15170dzK.this.AEQbTJ());
            java.lang.Long selectedChain = C15170dzK.this.copydefault().getSelectedChain();
            boolean enableWithoutBackup = C15170dzK.this.copydefault().getEnableWithoutBackup();
            WalletSelectDappCustomParams dappCustomParams = C15170dzK.this.copydefault().getDappCustomParams();
            java.lang.Boolean boolIsBrc20 = C15170dzK.this.copydefault().isBrc20();
            SelectWalletNotice selectWalletNoticeAEQbTJ = c15196dzk.AEQbTJ(interfaceC9738bbJ, weakReference, selectedChain, enableWithoutBackup, dappCustomParams, boolIsBrc20 != null ? boolIsBrc20.booleanValue() : false);
            C15170dzK c15170dzK2 = C15170dzK.this;
            dMP dmp = ((dMK) c43312rms.OLrzqt()).djBIcL;
            Intrinsics.checkNotNullExpressionValue(dmp, "");
            android.view.View root = ((dMK) c43312rms.OLrzqt()).djBIcL.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            c15170dzK2.copydefault(dmp, selectWalletNoticeAEQbTJ, root);
            if (Intrinsics.EZpvd((java.lang.Object) C15170dzK.this.copydefault().getSelectedWalletId(), (java.lang.Object) interfaceC9738bbJ.DbNXlk())) {
                ((dMK) c43312rms.OLrzqt()).gEmmrt.setVisibility(0);
            } else {
                ((dMK) c43312rms.OLrzqt()).gEmmrt.setVisibility(8);
            }
            if (selectWalletNoticeAEQbTJ == null || Intrinsics.EZpvd(selectWalletNoticeAEQbTJ.getWalletEnable(), java.lang.Boolean.TRUE)) {
                AEQbTJ(c43312rms);
                ConstraintLayout constraintLayout = ((dMK) c43312rms.OLrzqt()).AYXKKw;
                final C15170dzK c15170dzK3 = C15170dzK.this;
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o.dzO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C15170dzK.StateListAnimator.copydefault(c15170dzK3, interfaceC9738bbJ, view);
                    }
                });
            } else {
                OLrzqt(c43312rms);
                ((dMK) c43312rms.OLrzqt()).gEmmrt.setAlpha(0.26f);
            }
            super.onBindViewHolder((C43312rms) c43312rms, interfaceC9738bbJ);
        }

        public static final void EZpvd(C15170dzK c15170dzK, InterfaceC9738bbJ interfaceC9738bbJ, android.view.View view) {
            C15123dyQ c15123dyQAEQbTJ = c15170dzK.AEQbTJ();
            java.lang.Long selectedChain = c15170dzK.copydefault().getSelectedChain();
            if (selectedChain != null) {
                long jLongValue = selectedChain.longValue();
                C15120dyN.TaskDescription taskDescription = C15120dyN.Companion;
                java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                java.util.List<java.lang.String> contractAddressList = c15170dzK.copydefault().getContractAddressList();
                Intrinsics.copydefault(contractAddressList);
                arrayList.addAll(contractAddressList);
                Unit unit = Unit.INSTANCE;
                C15120dyN c15120dyNKWHzl = taskDescription.KWHzl(strDbNXlk, jLongValue, arrayList, c15170dzK.copydefault().isDarkMode());
                androidx.fragment.app.FragmentManager childFragmentManager = c15123dyQAEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c15120dyNKWHzl.show(childFragmentManager);
            }
        }

        public static final void copydefault(C15170dzK c15170dzK, InterfaceC9738bbJ interfaceC9738bbJ, android.view.View view) {
            Function1<InterfaceC9738bbJ, Unit> function1OLrzqt = c15170dzK.OLrzqt();
            if (function1OLrzqt != null) {
                function1OLrzqt.invoke(interfaceC9738bbJ);
            }
        }

        public final void AEQbTJ(C43312rms<dMK> c43312rms) {
            android.content.Context context = C15170dzK.this.AEQbTJ().getContext();
            if (context != null) {
                ((dMK) c43312rms.OLrzqt()).AYXKKw.setEnabled(true);
                C15196dzk c15196dzk = C15196dzk.KWHzl;
                android.content.Context context2 = ((dMK) c43312rms.OLrzqt()).AYXKKw.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                java.lang.Integer numAEQbTJ = c15196dzk.AEQbTJ(context2, dLX.TaskDescription.KWHzl);
                if (numAEQbTJ != null) {
                    ((dMK) c43312rms.OLrzqt()).AEQbTJ.setTextColor(ContextCompat.getColor(context, numAEQbTJ.intValue()));
                }
                android.content.Context context3 = ((dMK) c43312rms.OLrzqt()).AYXKKw.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                java.lang.Integer numAEQbTJ2 = c15196dzk.AEQbTJ(context3, dLX.TaskDescription.OLrzqt);
                if (numAEQbTJ2 != null) {
                    int iIntValue = numAEQbTJ2.intValue();
                    ((dMK) c43312rms.OLrzqt()).copydefault.setTextColor(ContextCompat.getColor(context, iIntValue));
                    ((dMK) c43312rms.OLrzqt()).OLrzqt.setTextColor(ContextCompat.getColor(context, iIntValue));
                    ((dMK) c43312rms.OLrzqt()).valueOf.setTextColor(ContextCompat.getColor(context, iIntValue));
                }
            }
        }

        public final void OLrzqt(C43312rms<dMK> c43312rms) {
            android.content.Context context = C15170dzK.this.AEQbTJ().getContext();
            if (context != null) {
                ((dMK) c43312rms.OLrzqt()).AYXKKw.setEnabled(false);
                C15196dzk c15196dzk = C15196dzk.KWHzl;
                android.content.Context context2 = ((dMK) c43312rms.OLrzqt()).AYXKKw.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                java.lang.Integer numAEQbTJ = c15196dzk.AEQbTJ(context2, dLX.TaskDescription.copydefault);
                if (numAEQbTJ != null) {
                    int iIntValue = numAEQbTJ.intValue();
                    ((dMK) c43312rms.OLrzqt()).AEQbTJ.setTextColor(ContextCompat.getColor(context, iIntValue));
                    ((dMK) c43312rms.OLrzqt()).OLrzqt.setTextColor(ContextCompat.getColor(context, iIntValue));
                    ((dMK) c43312rms.OLrzqt()).OLrzqt.setTextColor(ContextCompat.getColor(context, iIntValue));
                    ((dMK) c43312rms.OLrzqt()).OLrzqt.setTextColor(ContextCompat.getColor(context, iIntValue));
                    ((dMK) c43312rms.OLrzqt()).copydefault.setTextColor(ContextCompat.getColor(context, iIntValue));
                    ((dMK) c43312rms.OLrzqt()).valueOf.setTextColor(ContextCompat.getColor(context, iIntValue));
                }
            }
        }
    }
}
