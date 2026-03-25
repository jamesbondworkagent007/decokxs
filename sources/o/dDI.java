package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.view.WrapContentGridLayoutManager;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.dDI;
import o.dDN;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dDI extends AbstractC32996moC {
    public RecyclerView EZpvd;
    public ActionBar KWHzl;
    public C59534zip copydefault = new C59534zip();

    public interface ActionBar {
        void AwvSrB();

        void OLrzqt(int i);

        void gHZMYf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.KWHzl = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return dLX.Fragment.OLrzqt;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "");
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(dLX.Application.spnCvw);
        this.EZpvd = recyclerView2;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new WrapContentGridLayoutManager(getContext(), 2));
        }
        RecyclerView recyclerView3 = this.EZpvd;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C57584ylF(2, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(15, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        RecyclerView recyclerView4 = this.EZpvd;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.copydefault);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(dDN.ActionBar.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.dDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dDI.OLrzqt(this.copydefault, (dDN.ActionBar) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dDM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dDI.OLrzqt(function1, obj);
            }
        });
        C55173xeu c55173xeu = (C55173xeu) view.findViewById(dLX.Application.djSkpj);
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        if (c15112dyF.djBIcL().isEmpty()) {
            if (c55173xeu != null) {
                c55173xeu.setVisibility(0);
            }
        } else if (c55173xeu != null) {
            c55173xeu.setVisibility(8);
        }
        this.copydefault.register(DappTabData.class, new Activity(c55173xeu, dLX.Fragment.values, dLZ.EZpvd));
        int iKWHzl = c15112dyF.KWHzl();
        if (iKWHzl != 0 || (recyclerView = this.EZpvd) == null) {
            return;
        }
        recyclerView.scrollToPosition(iKWHzl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(dDI ddi, dDN.ActionBar actionBar) {
        java.util.List<?> items = ddi.copydefault.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int i = 0;
        for (java.lang.Object obj : items) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if ((obj instanceof DappTabData) && Intrinsics.EZpvd((java.lang.Object) ((DappTabData) obj).getMThumbImageFileName(), (java.lang.Object) actionBar.KWHzl())) {
                ddi.copydefault.notifyItemChanged(i);
            }
            i++;
        }
        return Unit.INSTANCE;
    }

    public static final class Activity extends C43318rmy<DappTabData, AbstractC13473dMq> {
        public final /* synthetic */ C55173xeu EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(C55173xeu c55173xeu, int i, int i2) {
            super(i, i2);
            this.EZpvd = c55173xeu;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C43312rms<AbstractC13473dMq> c43312rms, final DappTabData dappTabData) {
            java.lang.String logo;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(dappTabData, "");
            super.onBindViewHolder((C43312rms) c43312rms, dappTabData);
            java.lang.String title = dappTabData.getTitle();
            int bindingAdapterPosition = c43312rms.getBindingAdapterPosition();
            if (bindingAdapterPosition != -1 && bindingAdapterPosition == 0) {
                c43312rms.itemView.setContentDescription("web3_discover_home_web_page_history_cell");
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) title)) {
                android.widget.TextView textView = ((AbstractC13473dMq) c43312rms.OLrzqt()).AhwBna;
                C14923duc c14923duc = C14923duc.EZpvd;
                if (title == null) {
                    title = "";
                }
                textView.setText(c14923duc.KWHzl(title));
            } else {
                android.widget.TextView textView2 = ((AbstractC13473dMq) c43312rms.OLrzqt()).AhwBna;
                android.content.Context context = dDI.this.getContext();
                textView2.setText(context != null ? context.getString(dLX.Dialog.getNewProxyInstance) : null);
            }
            PlatformItem mItem = dappTabData.getMItem();
            if (mItem != null && (logo = mItem.getLogo()) != null && logo.length() > 0) {
                ComponentCallbacks2C5333Nr componentCallbacks2C5333NrEZpvd = Glide.EZpvd(dDI.this);
                PlatformItem mItem2 = dappTabData.getMItem();
                Intrinsics.copydefault(componentCallbacks2C5333NrEZpvd.EZpvd(mItem2 != null ? mItem2.getLogo() : null).KWHzl(dLX.ActionBar.AYXKKw).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(90))).EZpvd(((AbstractC13473dMq) c43312rms.OLrzqt()).AEQbTJ));
            } else if (dappTabData.getIcon() == null) {
                ((AbstractC13473dMq) c43312rms.OLrzqt()).AEQbTJ.setImageResource(dLX.ActionBar.AYXKKw);
            } else {
                ((AbstractC13473dMq) c43312rms.OLrzqt()).AEQbTJ.setImageBitmap(dappTabData.getIcon());
            }
            if (dappTabData.getHasError()) {
                Glide.KWHzl(((AbstractC13473dMq) c43312rms.OLrzqt()).KWHzl).AEQbTJ().EZpvd(java.lang.Integer.valueOf(dLX.ActionBar.copydefault)).EZpvd((android.widget.ImageView) ((AbstractC13473dMq) c43312rms.OLrzqt()).KWHzl);
            } else {
                java.lang.String strDjBIcL = dDN.copydefault.djBIcL();
                java.lang.String mThumbImageFileName = dappTabData.getMThumbImageFileName();
                if (mThumbImageFileName == null) {
                    mThumbImageFileName = "";
                }
                java.io.File file = new java.io.File(strDjBIcL, mThumbImageFileName);
                if (file.exists() && file.isFile()) {
                    Glide.KWHzl(((AbstractC13473dMq) c43312rms.OLrzqt()).KWHzl).OLrzqt(file).EZpvd((android.widget.ImageView) ((AbstractC13473dMq) c43312rms.OLrzqt()).KWHzl);
                } else {
                    Glide.KWHzl(((AbstractC13473dMq) c43312rms.OLrzqt()).KWHzl).copydefault(dappTabData.getMThumbImage()).EZpvd((android.widget.ImageView) ((AbstractC13473dMq) c43312rms.OLrzqt()).KWHzl);
                }
            }
            ((AbstractC13473dMq) c43312rms.OLrzqt()).EZpvd.setSelected(Intrinsics.EZpvd(dappTabData, C15112dyF.AEQbTJ.OLrzqt()));
            if (((AbstractC13473dMq) c43312rms.OLrzqt()).EZpvd.isSelected()) {
                ConstraintLayout constraintLayout = ((AbstractC13473dMq) c43312rms.OLrzqt()).EZpvd;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                int iDpInt$default = C55298xhM.dpInt$default(3, (android.content.Context) null, 1, (java.lang.Object) null);
                constraintLayout.setPadding(iDpInt$default, iDpInt$default, iDpInt$default, iDpInt$default);
            } else {
                ConstraintLayout constraintLayout2 = ((AbstractC13473dMq) c43312rms.OLrzqt()).EZpvd;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                int iDpInt$default2 = C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null);
                constraintLayout2.setPadding(iDpInt$default2, iDpInt$default2, iDpInt$default2, iDpInt$default2);
            }
            ConstraintLayout constraintLayout3 = ((AbstractC13473dMq) c43312rms.OLrzqt()).EZpvd;
            final dDI ddi = dDI.this;
            constraintLayout3.setOnClickListener(new View.OnClickListener() { // from class: o.dDK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    dDI.Activity.EZpvd(ddi, dappTabData, view);
                }
            });
            android.widget.ImageView imageView = ((AbstractC13473dMq) c43312rms.OLrzqt()).OLrzqt;
            final dDI ddi2 = dDI.this;
            final C55173xeu c55173xeu = this.EZpvd;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.dDJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    dDI.Activity.AEQbTJ(dappTabData, this, c43312rms, ddi2, c55173xeu, view);
                }
            });
        }

        public static final void EZpvd(dDI ddi, DappTabData dappTabData, android.view.View view) {
            androidx.fragment.app.FragmentTransaction fragmentTransactionRemove;
            ActionBar actionBar = ddi.KWHzl;
            if (actionBar != null) {
                actionBar.OLrzqt(C15112dyF.AEQbTJ.djBIcL().indexOf(dappTabData));
            }
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = ddi.getParentFragmentManager().beginTransaction();
            if (fragmentTransactionBeginTransaction == null || (fragmentTransactionRemove = fragmentTransactionBeginTransaction.remove(ddi)) == null) {
                return;
            }
            fragmentTransactionRemove.commitAllowingStateLoss();
        }

        public static final void AEQbTJ(DappTabData dappTabData, Activity activity, C43312rms c43312rms, dDI ddi, C55173xeu c55173xeu, android.view.View view) {
            int position;
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            if (Intrinsics.EZpvd(dappTabData, c15112dyF.OLrzqt()) && c15112dyF.djBIcL().size() > 1) {
                if (activity.getPosition(c43312rms) == c15112dyF.djBIcL().size() - 1) {
                    position = activity.getPosition(c43312rms) - 1;
                    c15112dyF.KWHzl(c15112dyF.djBIcL().get(position));
                } else {
                    position = activity.getPosition(c43312rms) + 1;
                    c15112dyF.KWHzl(c15112dyF.djBIcL().get(position));
                }
                ddi.copydefault.notifyItemChanged(position);
                c15112dyF.copydefault(activity.getPosition(c43312rms));
                ddi.copydefault.notifyItemRemoved(activity.getPosition(c43312rms));
                SPUtils.put("LAST_TAB", java.lang.Integer.valueOf(position));
            } else {
                c15112dyF.copydefault(activity.getPosition(c43312rms));
                ddi.copydefault.notifyItemRemoved(activity.getPosition(c43312rms));
            }
            if (c15112dyF.djBIcL().size() == 0) {
                c55173xeu.setVisibility(0);
            }
            ActionBar actionBar = ddi.KWHzl;
            if (actionBar != null) {
                actionBar.AwvSrB();
            }
        }
    }

    public final void AEQbTJ() {
        C55173xeu c55173xeu;
        this.copydefault.notifyDataSetChanged();
        android.view.View view = getView();
        if (view == null || (c55173xeu = (C55173xeu) view.findViewById(dLX.Application.djSkpj)) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        C14742drG c14742drG = C14742drG.KWHzl;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        c14742drG.AEQbTJ(java.lang.String.valueOf(c15112dyF.djBIcL().size()));
        this.copydefault.setItems(c15112dyF.djBIcL());
        this.copydefault.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.gHZMYf();
        }
        this.KWHzl = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C15141dyi.copydefault.AEQbTJ(getContext());
        super.onDestroy();
    }
}
