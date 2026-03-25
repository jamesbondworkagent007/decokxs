package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;
import com.okinc.business.defi.biz.net.bean.DappBTCXRCAssets;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21213gvX extends ConstraintLayout {
    public final AbstractC16891esV AEQbTJ;
    public C10854bwM EZpvd;
    public java.util.List<DappBTCUTXOInfo> KWHzl;
    public Function1<? super java.lang.String, Unit> OLrzqt;
    public java.util.List<DappBTCUTXOInfo> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21213gvX(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC16891esV abstractC16891esVKWHzl = AbstractC16891esV.KWHzl(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC16891esVKWHzl, "");
        this.AEQbTJ = abstractC16891esVKWHzl;
        this.copydefault = yDY.AhwBna();
        this.KWHzl = yDY.AhwBna();
        RecyclerView recyclerView = abstractC16891esVKWHzl.djBIcL;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        C43316rmw c43316rmw = new C43316rmw();
        int i = C13754dXa.TaskDescription.DMb;
        int i2 = dTV.isConnected;
        c43316rmw.register(DappBTCUTXOInfo.class, new TaskDescription(i, i2));
        recyclerView.setAdapter(c43316rmw);
        RecyclerView recyclerView2 = abstractC16891esVKWHzl.AhwBna;
        recyclerView2.setHasFixedSize(true);
        recyclerView2.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        C43316rmw c43316rmw2 = new C43316rmw();
        c43316rmw2.register(DappBTCUTXOInfo.class, new Application(C13754dXa.TaskDescription.DMb, i2));
        recyclerView2.setAdapter(c43316rmw2);
        LinearLayoutCompat linearLayoutCompat = abstractC16891esVKWHzl.gEmmrt;
        linearLayoutCompat.setOnClickListener(new LoaderManager(linearLayoutCompat, 1000L, this));
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21213gvX(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        AbstractC16891esV abstractC16891esVKWHzl = AbstractC16891esV.KWHzl(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC16891esVKWHzl, "");
        this.AEQbTJ = abstractC16891esVKWHzl;
        this.copydefault = yDY.AhwBna();
        this.KWHzl = yDY.AhwBna();
        RecyclerView recyclerView = abstractC16891esVKWHzl.djBIcL;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        C43316rmw c43316rmw = new C43316rmw();
        int i = C13754dXa.TaskDescription.DMb;
        int i2 = dTV.isConnected;
        c43316rmw.register(DappBTCUTXOInfo.class, new TaskDescription(i, i2));
        recyclerView.setAdapter(c43316rmw);
        RecyclerView recyclerView2 = abstractC16891esVKWHzl.AhwBna;
        recyclerView2.setHasFixedSize(true);
        recyclerView2.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        C43316rmw c43316rmw2 = new C43316rmw();
        c43316rmw2.register(DappBTCUTXOInfo.class, new Application(C13754dXa.TaskDescription.DMb, i2));
        recyclerView2.setAdapter(c43316rmw2);
        LinearLayoutCompat linearLayoutCompat = abstractC16891esVKWHzl.gEmmrt;
        linearLayoutCompat.setOnClickListener(new FragmentManager(linearLayoutCompat, 1000L, this));
        copydefault();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21213gvX(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        AbstractC16891esV abstractC16891esVKWHzl = AbstractC16891esV.KWHzl(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC16891esVKWHzl, "");
        this.AEQbTJ = abstractC16891esVKWHzl;
        this.copydefault = yDY.AhwBna();
        this.KWHzl = yDY.AhwBna();
        RecyclerView recyclerView = abstractC16891esVKWHzl.djBIcL;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        C43316rmw c43316rmw = new C43316rmw();
        int i2 = C13754dXa.TaskDescription.DMb;
        int i3 = dTV.isConnected;
        c43316rmw.register(DappBTCUTXOInfo.class, new TaskDescription(i2, i3));
        recyclerView.setAdapter(c43316rmw);
        RecyclerView recyclerView2 = abstractC16891esVKWHzl.AhwBna;
        recyclerView2.setHasFixedSize(true);
        recyclerView2.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null)));
        C43316rmw c43316rmw2 = new C43316rmw();
        c43316rmw2.register(DappBTCUTXOInfo.class, new Application(C13754dXa.TaskDescription.DMb, i3));
        recyclerView2.setAdapter(c43316rmw2);
        LinearLayoutCompat linearLayoutCompat = abstractC16891esVKWHzl.gEmmrt;
        linearLayoutCompat.setOnClickListener(new PendingIntent(linearLayoutCompat, 1000L, this));
        copydefault();
    }

    /* JADX INFO: renamed from: o.gvX$TaskDescription */
    public static final class TaskDescription extends C43318rmy<DappBTCUTXOInfo, AbstractC16671eoN> {
        public TaskDescription(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16671eoN> c43312rms, DappBTCUTXOInfo dappBTCUTXOInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(dappBTCUTXOInfo, "");
            super.onBindViewHolder((C43312rms) c43312rms, dappBTCUTXOInfo);
            C21213gvX.this.AEQbTJ(c43312rms, dappBTCUTXOInfo);
            C21213gvX.this.OLrzqt(c43312rms, dappBTCUTXOInfo);
        }
    }

    /* JADX INFO: renamed from: o.gvX$Application */
    public static final class Application extends C43318rmy<DappBTCUTXOInfo, AbstractC16671eoN> {
        public Application(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16671eoN> c43312rms, DappBTCUTXOInfo dappBTCUTXOInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(dappBTCUTXOInfo, "");
            super.onBindViewHolder((C43312rms) c43312rms, dappBTCUTXOInfo);
            C21213gvX.this.AEQbTJ(c43312rms, dappBTCUTXOInfo);
            C21213gvX.this.OLrzqt(c43312rms, dappBTCUTXOInfo);
        }
    }

    public final void KWHzl() {
        this.AEQbTJ.KWHzl.setRotation(0.0f);
        this.AEQbTJ.valueOf.setVisibility(8);
    }

    public final void copydefault() {
        this.AEQbTJ.KWHzl.setRotation(180.0f);
        this.AEQbTJ.valueOf.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(C43312rms<AbstractC16671eoN> c43312rms, DappBTCUTXOInfo dappBTCUTXOInfo) {
        int iCopydefault;
        java.lang.String addressStr$default;
        android.view.View root = ((AbstractC16671eoN) c43312rms.OLrzqt()).getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, dappBTCUTXOInfo, this));
        java.lang.Boolean boolIsWalletAddress = dappBTCUTXOInfo.isWalletAddress();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(boolIsWalletAddress, bool)) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        ((AbstractC16671eoN) c43312rms.OLrzqt()).valueOf.setTextColor(iCopydefault);
        android.widget.TextView textView = ((AbstractC16671eoN) c43312rms.OLrzqt()).valueOf;
        java.util.List<java.lang.String> address = dappBTCUTXOInfo.getAddress();
        if (C33129mqd.AEQbTJ(address != null ? java.lang.Integer.valueOf(address.size()) : null, 1)) {
            addressStr$default = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OBzZra);
        } else {
            C14079deg c14079deg = C14079deg.EZpvd;
            java.util.List<java.lang.String> address2 = dappBTCUTXOInfo.getAddress();
            addressStr$default = C14079deg.getAddressStr$default(c14079deg, address2 != null ? (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(address2) : null, false, 2, null);
        }
        textView.setText(addressStr$default);
        ((AbstractC16671eoN) c43312rms.OLrzqt()).AYXKKw.setTextColor(iCopydefault);
        android.widget.TextView textView2 = ((AbstractC16671eoN) c43312rms.OLrzqt()).AYXKKw;
        java.lang.String amount = dappBTCUTXOInfo.getAmount();
        if (amount != null) {
            C10854bwM c10854bwM = this.EZpvd;
            int iCopydefault2 = C11600cUg.copydefault(c10854bwM != null ? java.lang.Integer.valueOf(c10854bwM.valueOf()) : null);
            C10854bwM c10854bwM2 = this.EZpvd;
            int iAkhnZx = c10854bwM2 != null ? c10854bwM2.AkhnZx() : 6;
            C10854bwM c10854bwM3 = this.EZpvd;
            strEZpvd = C54870xYj.EZpvd(amount, iCopydefault2, iAkhnZx, c10854bwM3 != null ? c10854bwM3.fJNWhG() : null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        textView2.setText(strEZpvd);
        ((AbstractC16671eoN) c43312rms.OLrzqt()).djBIcL.setVisibility((Intrinsics.EZpvd(dappBTCUTXOInfo.isWalletAddress(), bool) && Intrinsics.EZpvd(dappBTCUTXOInfo.getShowSign(), bool)) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(C43312rms<AbstractC16671eoN> c43312rms, DappBTCUTXOInfo dappBTCUTXOInfo) {
        ConstraintLayout constraintLayout = ((AbstractC16671eoN) c43312rms.OLrzqt()).EZpvd;
        java.util.List<DappBTCXRCAssets> xrcAssets = dappBTCUTXOInfo.getXrcAssets();
        int i = 0;
        constraintLayout.setVisibility((xrcAssets == null || xrcAssets.isEmpty()) ? 8 : 0);
        java.util.List<DappBTCXRCAssets> xrcAssets2 = dappBTCUTXOInfo.getXrcAssets();
        boolean zAEQbTJ = C33129mqd.AEQbTJ(xrcAssets2 != null ? java.lang.Integer.valueOf(xrcAssets2.size()) : null, 10);
        RecyclerView recyclerView = ((AbstractC16671eoN) c43312rms.OLrzqt()).copydefault;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(8.0f, null, 1, null), 0));
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(DappBTCXRCAssets.class, new Activity());
        if (C33129mqd.KWHzl((java.util.Collection) dappBTCUTXOInfo.getXrcAssets())) {
            java.util.List<DappBTCXRCAssets> xrcAssets3 = dappBTCUTXOInfo.getXrcAssets();
            Intrinsics.copydefault(xrcAssets3);
            java.util.List<DappBTCXRCAssets> xrcAssets4 = dappBTCUTXOInfo.getXrcAssets();
            Intrinsics.copydefault(xrcAssets4);
            c43316rmw.AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) xrcAssets3.subList(0, java.lang.Math.min(xrcAssets4.size(), 10))));
        }
        recyclerView.setAdapter(c43316rmw);
        if (zAEQbTJ) {
            ((AbstractC16671eoN) c43312rms.OLrzqt()).AEQbTJ.setVisibility(0);
            ((AbstractC16671eoN) c43312rms.OLrzqt()).OLrzqt.setVisibility(0);
            ((AbstractC16671eoN) c43312rms.OLrzqt()).gEmmrt.setVisibility(0);
            android.widget.TextView textView = ((AbstractC16671eoN) c43312rms.OLrzqt()).gEmmrt;
            int i2 = C13754dXa.FragmentManager.zNQIcI;
            java.util.List<DappBTCXRCAssets> xrcAssets5 = dappBTCUTXOInfo.getXrcAssets();
            Intrinsics.copydefault(xrcAssets5);
            textView.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.subS$default(java.lang.Integer.valueOf(xrcAssets5.size()), 10, null, null, null, 14, null)))));
            java.util.List<DappBTCXRCAssets> xrcAssets6 = dappBTCUTXOInfo.getXrcAssets();
            Intrinsics.copydefault(xrcAssets6);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : xrcAssets6) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(i), (java.lang.Object) 10) && C33129mqd.valueOf(java.lang.Integer.valueOf(i), 12)) {
                    arrayList.add(obj);
                }
                i++;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String logo = ((DappBTCXRCAssets) it.next()).getLogo();
                if (logo == null) {
                    logo = "";
                }
                arrayList2.add(logo);
            }
            C14726dqr.OLrzqt.KWHzl(((AbstractC16671eoN) c43312rms.OLrzqt()).AEQbTJ, arrayList2, (64 & 4) != 0 ? 20 : 20, (64 & 8) != 0 ? 6 : 6, (64 & 16) != 0 ? 2.0f : 0.0f, (64 & 32) != 0 ? 26.0f : 20.0f, (64 & 64) != 0 ? 4 : 0);
            android.widget.TextView textView2 = ((AbstractC16671eoN) c43312rms.OLrzqt()).gEmmrt;
            textView2.setOnClickListener(new StateListAnimator(textView2, 1000L, c43312rms, dappBTCUTXOInfo));
            return;
        }
        ((AbstractC16671eoN) c43312rms.OLrzqt()).AEQbTJ.setVisibility(8);
        ((AbstractC16671eoN) c43312rms.OLrzqt()).OLrzqt.setVisibility(8);
        ((AbstractC16671eoN) c43312rms.OLrzqt()).gEmmrt.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.gvX$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C21213gvX EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ DappBTCUTXOInfo OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, DappBTCUTXOInfo dappBTCUTXOInfo, C21213gvX c21213gvX) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = dappBTCUTXOInfo;
            this.EZpvd = c21213gvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function1 function1;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.util.List<java.lang.String> address = this.OLrzqt.getAddress();
                if (C33129mqd.AEQbTJ(address != null ? java.lang.Integer.valueOf(address.size()) : null, 1) || (function1 = this.EZpvd.OLrzqt) == null) {
                    return;
                }
                java.util.List<java.lang.String> address2 = this.OLrzqt.getAddress();
                function1.invoke(address2 != null ? (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(address2) : null);
            }
        }
    }

    /* JADX INFO: renamed from: o.gvX$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C21213gvX AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C21213gvX c21213gvX) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c21213gvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ.AEQbTJ.getRoot().setVisibility(8);
                RecyclerView.Adapter adapter = this.AEQbTJ.AEQbTJ.AhwBna.getAdapter();
                Intrinsics.copydefault(adapter, "");
                ((C43316rmw) adapter).AhwBna(this.AEQbTJ.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.gvX$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C21213gvX EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C21213gvX c21213gvX) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c21213gvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.OLrzqt.getRoot().setVisibility(8);
                RecyclerView.Adapter adapter = this.EZpvd.AEQbTJ.djBIcL.getAdapter();
                Intrinsics.copydefault(adapter, "");
                ((C43316rmw) adapter).AhwBna(this.EZpvd.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.gvX$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C21213gvX OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C21213gvX c21213gvX) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c21213gvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.OLrzqt.AEQbTJ.valueOf.getVisibility() == 0) {
                    this.OLrzqt.KWHzl();
                } else {
                    this.OLrzqt.copydefault();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gvX$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C21213gvX KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C21213gvX c21213gvX) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c21213gvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.KWHzl.AEQbTJ.valueOf.getVisibility() == 0) {
                    this.KWHzl.KWHzl();
                } else {
                    this.KWHzl.copydefault();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gvX$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ C21213gvX AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C21213gvX c21213gvX) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c21213gvX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.AEQbTJ.AEQbTJ.valueOf.getVisibility() == 0) {
                    this.AEQbTJ.KWHzl();
                } else {
                    this.AEQbTJ.copydefault();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gvX$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ DappBTCUTXOInfo EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C43312rms OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C43312rms c43312rms, DappBTCUTXOInfo dappBTCUTXOInfo) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c43312rms;
            this.EZpvd = dappBTCUTXOInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ((AbstractC16671eoN) this.OLrzqt.OLrzqt()).AEQbTJ.setVisibility(8);
                ((AbstractC16671eoN) this.OLrzqt.OLrzqt()).OLrzqt.setVisibility(8);
                ((AbstractC16671eoN) this.OLrzqt.OLrzqt()).gEmmrt.setVisibility(8);
                RecyclerView.Adapter adapter = ((AbstractC16671eoN) this.OLrzqt.OLrzqt()).copydefault.getAdapter();
                Intrinsics.copydefault(adapter, "");
                java.util.List<DappBTCXRCAssets> xrcAssets = this.EZpvd.getXrcAssets();
                Intrinsics.copydefault(xrcAssets);
                ((C43316rmw) adapter).AhwBna(xrcAssets);
            }
        }
    }

    private final void EZpvd() {
        this.AEQbTJ.AYXKKw.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.arDRxL, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.copydefault.size()))))));
        RecyclerView.Adapter adapter = this.AEQbTJ.djBIcL.getAdapter();
        Intrinsics.copydefault(adapter, "");
        java.util.List<DappBTCUTXOInfo> list = this.copydefault;
        ((C43316rmw) adapter).AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list.subList(0, java.lang.Math.min(list.size(), 50))));
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.copydefault.size()), 50)) {
            this.AEQbTJ.OLrzqt.getRoot().setVisibility(0);
            this.AEQbTJ.OLrzqt.EZpvd.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.RYPzIz, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.subS$default(java.lang.Integer.valueOf(this.copydefault.size()), 50, null, null, null, 14, null)))));
            android.widget.TextView textView = this.AEQbTJ.OLrzqt.OLrzqt;
            java.util.List<DappBTCUTXOInfo> list2 = this.copydefault;
            textView.setText(EZpvd(list2.subList(50, list2.size())));
            android.view.View root = this.AEQbTJ.OLrzqt.getRoot();
            root.setOnClickListener(new Fragment(root, 1000L, this));
            return;
        }
        this.AEQbTJ.OLrzqt.getRoot().setVisibility(8);
    }

    private final void OLrzqt() {
        this.AEQbTJ.AkhnZx.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.ddauOi, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.KWHzl.size()))))));
        RecyclerView.Adapter adapter = this.AEQbTJ.AhwBna.getAdapter();
        Intrinsics.copydefault(adapter, "");
        java.util.List<DappBTCUTXOInfo> list = this.KWHzl;
        ((C43316rmw) adapter).AhwBna(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list.subList(0, java.lang.Math.min(list.size(), 50))));
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.KWHzl.size()), 50)) {
            this.AEQbTJ.AEQbTJ.getRoot().setVisibility(0);
            this.AEQbTJ.AEQbTJ.EZpvd.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.RYPzIz, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.subS$default(java.lang.Integer.valueOf(this.KWHzl.size()), 50, null, null, null, 14, null)))));
            android.widget.TextView textView = this.AEQbTJ.AEQbTJ.OLrzqt;
            java.util.List<DappBTCUTXOInfo> list2 = this.KWHzl;
            textView.setText(EZpvd(list2.subList(50, list2.size())));
            android.view.View root = this.AEQbTJ.AEQbTJ.getRoot();
            root.setOnClickListener(new Dialog(root, 1000L, this));
            return;
        }
        this.AEQbTJ.AEQbTJ.getRoot().setVisibility(8);
    }

    private final java.lang.String EZpvd(java.util.List<DappBTCUTXOInfo> list) {
        BigDecimal bigDecimal = new BigDecimal("0");
        java.util.Iterator<T> it = list.iterator();
        BigDecimal bigDecimalKWHzl = bigDecimal;
        while (it.hasNext()) {
            bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, ((DappBTCUTXOInfo) it.next()).getAmount());
        }
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
        C10854bwM c10854bwM = this.EZpvd;
        int iCopydefault = C11600cUg.copydefault(c10854bwM != null ? java.lang.Integer.valueOf(c10854bwM.valueOf()) : null);
        C10854bwM c10854bwM2 = this.EZpvd;
        int iAkhnZx = c10854bwM2 != null ? c10854bwM2.AkhnZx() : 6;
        C10854bwM c10854bwM3 = this.EZpvd;
        return C54870xYj.EZpvd(strConvertToString$default, iCopydefault, iAkhnZx, c10854bwM3 != null ? c10854bwM3.fJNWhG() : null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    /* JADX INFO: renamed from: o.gvX$Activity */
    public static final class Activity extends C43318rmy<DappBTCXRCAssets, AbstractC16669eoL> {
        @Override // o.AbstractC43310rmq
        public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, java.lang.Object obj) {
            onBindViewHolder((C43312rms<AbstractC16669eoL>) c43312rms, (DappBTCXRCAssets) obj);
        }

        public Activity() {
            super(C13754dXa.TaskDescription.onComplete, dTV.isConnected);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16669eoL> c43312rms, @NotNull DappBTCXRCAssets dappBTCXRCAssets) {
            int i;
            java.lang.String strOLrzqt;
            java.lang.String logo;
            java.lang.Character chWlaJM;
            java.lang.String string;
            java.lang.String strOLrzqt2;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(dappBTCXRCAssets, "");
            super.onBindViewHolder((C43312rms) c43312rms, dappBTCXRCAssets);
            android.widget.TextView textView = ((AbstractC16669eoL) c43312rms.OLrzqt()).AEQbTJ;
            java.lang.String amount = dappBTCXRCAssets.getAmount();
            if (amount != null) {
                java.lang.Integer vdecimal = dappBTCXRCAssets.getVdecimal();
                i = 8;
                strOLrzqt = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, vdecimal != null ? vdecimal.intValue() : 8, dappBTCXRCAssets.getSymbol(), (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            } else {
                i = 8;
                strOLrzqt = null;
            }
            textView.setText(strOLrzqt);
            ((AbstractC16669eoL) c43312rms.OLrzqt()).copydefault.setText(dappBTCXRCAssets.getProtocolName());
            java.lang.String logo2 = dappBTCXRCAssets.getLogo();
            if (logo2 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = logo2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase != null && C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                    logo = "SVG:" + dappBTCXRCAssets.getLogo();
                } else {
                    logo = dappBTCXRCAssets.getLogo();
                    if (logo == null) {
                        logo = "";
                    }
                }
            }
            java.lang.Integer protocolType = dappBTCXRCAssets.getProtocolType();
            if (protocolType != null && protocolType.intValue() == 2) {
                Glide.KWHzl(((AbstractC16669eoL) c43312rms.OLrzqt()).OLrzqt).EZpvd().copydefault(logo).KWHzl(C13754dXa.Activity.hrNTAI).copydefault(C13754dXa.Activity.hrNTAI).OLrzqt((RX<?>) AEQbTJ(logo, i)).EZpvd((android.widget.ImageView) ((AbstractC16669eoL) c43312rms.OLrzqt()).OLrzqt);
                return;
            }
            java.lang.String symbol = dappBTCXRCAssets.getSymbol();
            if (symbol != null && (chWlaJM = C59454zhO.wlaJM(symbol)) != null && (string = chWlaJM.toString()) != null && (strOLrzqt2 = C9700baY.OLrzqt(string)) != null) {
                str = strOLrzqt2;
            }
            if (logo == null || logo.length() == 0) {
                logo = str;
            }
            Glide.KWHzl(((AbstractC16669eoL) c43312rms.OLrzqt()).OLrzqt).EZpvd().copydefault(logo).KWHzl(C52761wXj.TaskDescription.aHXSQp).copydefault(C52761wXj.TaskDescription.aHXSQp).OLrzqt((RX<?>) AEQbTJ(logo, 90)).EZpvd((android.widget.ImageView) ((AbstractC16669eoL) c43312rms.OLrzqt()).OLrzqt);
        }

        private final C5448Sc AEQbTJ(java.lang.String str, int i) {
            C5448Sc c5448Sc;
            C5448Sc c5448ScCopydefault = C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(i)).AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
            Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
            C5448Sc c5448Sc2 = c5448ScCopydefault;
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                    C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                    Intrinsics.copydefault(c5448ScAEQbTJ);
                    c5448Sc = c5448ScAEQbTJ;
                } else {
                    C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                    Intrinsics.copydefault(c5448ScCopydefault2);
                    c5448Sc = c5448ScCopydefault2;
                }
                return c5448Sc;
            }
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String lowerCase2 = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
        }
    }

    public final void setInputAndOutput(@NotNull java.lang.String str, @NotNull C10854bwM c10854bwM, @NotNull java.util.List<DappBTCUTXOInfo> list, @NotNull java.util.List<DappBTCUTXOInfo> list2, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
        this.EZpvd = c10854bwM;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            java.lang.Boolean boolValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            DappBTCUTXOInfo dappBTCUTXOInfo = (DappBTCUTXOInfo) it.next();
            dappBTCUTXOInfo.setShowSign(java.lang.Boolean.TRUE);
            java.util.List<java.lang.String> address = dappBTCUTXOInfo.getAddress();
            if (address != null) {
                boolValueOf = java.lang.Boolean.valueOf(address.contains(str));
            }
            dappBTCUTXOInfo.setWalletAddress(boolValueOf);
        }
        this.copydefault = list;
        for (DappBTCUTXOInfo dappBTCUTXOInfo2 : list2) {
            dappBTCUTXOInfo2.setShowSign(java.lang.Boolean.FALSE);
            java.util.List<java.lang.String> address2 = dappBTCUTXOInfo2.getAddress();
            dappBTCUTXOInfo2.setWalletAddress(address2 != null ? java.lang.Boolean.valueOf(address2.contains(str)) : null);
        }
        this.KWHzl = list2;
        EZpvd();
        OLrzqt();
    }
}
