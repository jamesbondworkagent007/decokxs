package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.EIP7702RevokeInfo;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702ChainStatus;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dYg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C13787dYg extends AbstractC59533zio<dXY, RecyclerView.ViewHolder> {
    public final AbstractC12782ctV AEQbTJ;

    /* JADX INFO: renamed from: o.dYg$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EIP7702ChainStatus.values().length];
            try {
                iArr[EIP7702ChainStatus.UpgradedOKX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EIP7702ChainStatus.UpgradedNonOKX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[EIP7702ChainStatus.Revoking.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[EIP7702ChainStatus.Upgrading.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    public C13787dYg(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.AEQbTJ = abstractC12782ctV;
    }

    /* JADX INFO: renamed from: o.dYg$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public ActionBar(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new ActionBar(layoutInflater.inflate(C13754dXa.TaskDescription.profile, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull dXY dxy) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(dxy, "");
        AbstractC16659eoB abstractC16659eoB = (AbstractC16659eoB) DataBindingUtil.bind(viewHolder.itemView);
        if (abstractC16659eoB == null) {
            return;
        }
        android.content.Context context = viewHolder.itemView.getContext();
        abstractC16659eoB.OLrzqt.setText(dxy.KWHzl());
        android.widget.TextView textView = abstractC16659eoB.copydefault;
        java.lang.Long upgradeTime = dxy.EZpvd().getUpgradeTime();
        textView.setText(upgradeTime == null ? "--" : pTA.formatSimpleDate$default(new Date(upgradeTime.longValue()), null, 1, null));
        android.widget.ImageView imageView = abstractC16659eoB.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String strOLrzqt = dxy.OLrzqt();
        C57659ymb.KWHzl(imageView, strOLrzqt != null ? strOLrzqt : "", C52761wXj.TaskDescription.aHXSQp);
        C52794wYp c52794wYp = abstractC16659eoB.AEQbTJ;
        Intrinsics.copydefault(c52794wYp);
        c52794wYp.setVisibility(0);
        c52794wYp.setEnabled(false);
        int i = Activity.KWHzl[EIP7702ChainStatus.Companion.copydefault(dxy.AEQbTJ()).ordinal()];
        if (i == 1 || i == 2) {
            c52794wYp.setText(context.getString(C13754dXa.FragmentManager.isActive));
            c52794wYp.setEnabled((this.AEQbTJ.QfsBiF() || this.AEQbTJ.zsXlph()) ? false : true);
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, dxy, context));
        } else if (i == 3) {
            c52794wYp.setText(context.getString(C13754dXa.FragmentManager.setActive));
        } else if (i == 4) {
            c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMetadata));
        } else {
            c52794wYp.setVisibility(8);
        }
    }

    public final void EZpvd(ApproveItem approveItem, EIP7702RevokeInfo eIP7702RevokeInfo, AbstractC12782ctV abstractC12782ctV, android.content.Context context) {
        java.lang.Long chainIndex = eIP7702RevokeInfo.getChainIndex();
        if (chainIndex != null) {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(chainIndex.longValue());
            if (c10854bwMCopydefault == null) {
                return;
            }
            eCG ecg = eCG.OLrzqt;
            Intrinsics.copydefault(context, "");
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) context;
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            long jFetchVPNInfo = c10854bwMCopydefault.fetchVPNInfo();
            EVMContractSignData eVMContractSignData = new EVMContractSignData(null, null, null, null, abstractC12782ctV.EZpvd(c10854bwMCopydefault.fetchVPNInfo()), eIP7702RevokeInfo.getRevokeContractData(), null, null, null, null, null, null, null, C56402yEa.EZpvd(new EVMAuthorization(C33491mxU.copydefault(java.lang.String.valueOf(c10854bwMCopydefault.isConnected())), eIP7702RevokeInfo.getRevokeContractAddress(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 60, (DefaultConstructorMarker) null)), 8143, null);
            java.lang.String projectIcon = approveItem.getProjectIcon();
            java.lang.String str = projectIcon == null ? "" : projectIcon;
            java.lang.String string = context.getString(C13754dXa.FragmentManager.RckOJh);
            Intrinsics.checkNotNullExpressionValue(string, "");
            ecg.KWHzl(abstractActivityC33041mov, strDbNXlk, jFetchVPNInfo, eVMContractSignData, new PlatformItem(approveItem.getShowProjectName(string), str, null, approveItem.getShowProjectIconResource(C13754dXa.Activity.aKErDB), null, 20, null), new Function1() { // from class: o.dYe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13787dYg.KWHzl((android.os.Bundle) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(android.os.Bundle bundle) {
        if (bundle != null) {
            C15523eLm.refresh$default(C15523eLm.KWHzl, null, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.dYg$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C13787dYg KWHzl;
        public final /* synthetic */ dXY OLrzqt;
        public final /* synthetic */ android.content.Context copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C13787dYg c13787dYg, dXY dxy, android.content.Context context) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c13787dYg;
            this.OLrzqt = dxy;
            this.copydefault = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (!this.KWHzl.AEQbTJ.AubY() && !this.KWHzl.AEQbTJ.AwvSrB()) {
                    C55326xho.toast$default(C13754dXa.FragmentManager.UkCIYP, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return;
                }
                C13787dYg c13787dYg = this.KWHzl;
                ApproveItem approveItemCopydefault = this.OLrzqt.copydefault();
                EIP7702RevokeInfo eIP7702RevokeInfoEZpvd = this.OLrzqt.EZpvd();
                AbstractC12782ctV abstractC12782ctV = this.KWHzl.AEQbTJ;
                Intrinsics.copydefault(this.copydefault);
                c13787dYg.EZpvd(approveItemCopydefault, eIP7702RevokeInfoEZpvd, abstractC12782ctV, this.copydefault);
            }
        }
    }
}
