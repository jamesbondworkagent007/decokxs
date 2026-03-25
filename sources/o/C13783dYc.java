package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.Contract;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.Parameter;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.RawData;
import com.okinc.business.defi.api.bean.SignData;
import com.okinc.business.defi.api.bean.TrxDappSignData;
import com.okinc.business.defi.api.bean.Value;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.ApproveToken;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dYc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C13783dYc extends AbstractC59533zio<dXZ, RecyclerView.ViewHolder> {
    public final AbstractC12782ctV OLrzqt;
    public final ApproveListItem copydefault;

    public C13783dYc(@NotNull ApproveListItem approveListItem, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(approveListItem, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.copydefault = approveListItem;
        this.OLrzqt = abstractC12782ctV;
    }

    /* JADX INFO: renamed from: o.dYc$ActionBar */
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
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull dXZ dxz) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(dxz, "");
        AbstractC16659eoB abstractC16659eoB = (AbstractC16659eoB) DataBindingUtil.bind(viewHolder.itemView);
        if (abstractC16659eoB == null) {
            return;
        }
        android.content.Context context = viewHolder.itemView.getContext();
        android.widget.TextView textView = abstractC16659eoB.OLrzqt;
        if (Intrinsics.EZpvd((java.lang.Object) dxz.AEQbTJ(), (java.lang.Object) "2")) {
            strKWHzl = dxz.KWHzl();
        } else {
            strKWHzl = dxz.copydefault() + " " + dxz.KWHzl();
        }
        textView.setText(strKWHzl);
        android.widget.TextView textView2 = abstractC16659eoB.copydefault;
        java.lang.Long approvalTime = dxz.OLrzqt().getApprovalTime();
        textView2.setText(approvalTime == null ? "--" : pTA.formatSimpleDate$default(new Date(approvalTime.longValue()), null, 1, null));
        android.widget.ImageView imageView = abstractC16659eoB.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String strEZpvd = dxz.EZpvd();
        C57659ymb.KWHzl(imageView, strEZpvd != null ? strEZpvd : "", C52761wXj.TaskDescription.aHXSQp);
        C52794wYp c52794wYp = abstractC16659eoB.AEQbTJ;
        Intrinsics.copydefault(c52794wYp);
        c52794wYp.setVisibility(0);
        c52794wYp.setEnabled(false);
        java.lang.String strAEQbTJ = dxz.AEQbTJ();
        switch (strAEQbTJ.hashCode()) {
            case 49:
                if (strAEQbTJ.equals("1")) {
                    c52794wYp.setText(context.getString(C13754dXa.FragmentManager.AlertController3));
                    c52794wYp.setEnabled((this.OLrzqt.QfsBiF() || this.OLrzqt.zsXlph()) ? false : true);
                    c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, dxz, context));
                    return;
                }
                break;
            case 50:
                if (strAEQbTJ.equals("2")) {
                    c52794wYp.setText(context.getString(C13754dXa.FragmentManager.DjwCMv));
                    return;
                }
                break;
            case 51:
                if (strAEQbTJ.equals("3")) {
                    c52794wYp.setText(context.getString(C13754dXa.FragmentManager.OKSWiw));
                    return;
                }
                break;
        }
        c52794wYp.setVisibility(8);
    }

    public final void EZpvd(ApproveListItem approveListItem, ApproveToken approveToken, AbstractC12782ctV abstractC12782ctV, android.content.Context context) {
        int i;
        java.lang.String json;
        ApproveItem approveItemKWHzl = C15523eLm.KWHzl.KWHzl(approveListItem.isConnected(), approveListItem.AkhnZx(), approveListItem.AEQbTJ());
        if (approveItemKWHzl != null) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C33129mqd.valueOf(approveItemKWHzl.getCoinId()));
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : 0L, null, 2, null);
            java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
            java.lang.String str = address == null ? "" : address;
            java.lang.String approvalAddress = approveToken.getApprovalAddress();
            if (C59449zhJ.startsWith$default(approvalAddress, EIP1271Verifier.hexPrefix, false, 2, null)) {
                approvalAddress = StringsKt__StringsKt.KWHzl(approvalAddress, (java.lang.CharSequence) EIP1271Verifier.hexPrefix);
            }
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.QkdxfA()) {
                i = 0;
                json = new Gson().toJson(new SignData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "0", approveToken.getTokenAddress(), "0x095ea7b3000000000000000000000000" + approvalAddress + "0000000000000000000000000000000000000000000000000000000000000000", str, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, TypedValues.Custom.TYPE_STRING, (DefaultConstructorMarker) null));
            } else {
                i = 0;
                if (c10854bwMKWHzl != null && c10854bwMKWHzl.run()) {
                    json = new Gson().toJson(new TrxDappSignData(new RawData(C56402yEa.EZpvd(new Contract(new Parameter((java.lang.String) null, new Value((java.lang.Long) null, (java.lang.Long) null, approveToken.getTokenAddress(), (java.lang.String) null, (java.lang.String) null, approveToken.getAddress(), 27, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null), (java.lang.String) null, 2, (DefaultConstructorMarker) null)), (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, 62, (DefaultConstructorMarker) null), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, java.lang.Boolean.TRUE, 14, (DefaultConstructorMarker) null));
                } else {
                    C55326xho.toast$default(context.getString(C13754dXa.FragmentManager.invokespecialaVhqwO), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return;
                }
            }
            java.lang.String str2 = json;
            long jValueOf = C33129mqd.valueOf(approveToken.getCoinId());
            java.lang.String projectIcon = approveItemKWHzl.getProjectIcon();
            java.lang.String str3 = projectIcon == null ? "" : projectIcon;
            java.lang.String string = context.getString(C13754dXa.FragmentManager.RckOJh);
            Intrinsics.checkNotNullExpressionValue(string, "");
            PlatformItem platformItem = new PlatformItem(jValueOf, approveItemKWHzl.getShowProjectName(string), str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, approveItemKWHzl.getShowProjectIconResource(C13754dXa.Activity.aKErDB), (java.lang.String) null, (java.lang.String) null, 14328, (DefaultConstructorMarker) null);
            InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
            if (interfaceC9854bdT != null) {
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                long jFetchVPNInfo = c10854bwMKWHzl.fetchVPNInfo();
                Intrinsics.copydefault((java.lang.Object) str2);
                interfaceC9854bdT.AEQbTJ(context, new DappInteractionArgs(strDbNXlk, null, java.lang.String.valueOf(jFetchVPNInfo), platformItem, str2, java.lang.Long.valueOf(C33129mqd.valueOf(approveToken.getCoinId())), null, 6, null, null, approveToken.getApprovalAddress(), approveToken.getApprovalNum(), true, false, null, false, null, null, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(i), null, null, null, null, null, -67116222, null), new Function1() { // from class: o.dYa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C13783dYc.copydefault((android.os.Bundle) obj);
                    }
                }, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.dYc$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C13783dYc KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ dXZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C13783dYc c13783dYc, dXZ dxz, android.content.Context context) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c13783dYc;
            this.copydefault = dxz;
            this.OLrzqt = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C13783dYc c13783dYc = this.KWHzl;
                ApproveListItem approveListItem = c13783dYc.copydefault;
                ApproveToken approveTokenOLrzqt = this.copydefault.OLrzqt();
                AbstractC12782ctV abstractC12782ctV = this.KWHzl.OLrzqt;
                Intrinsics.copydefault(this.OLrzqt);
                c13783dYc.EZpvd(approveListItem, approveTokenOLrzqt, abstractC12782ctV, this.OLrzqt);
            }
        }
    }

    public static final Unit copydefault(android.os.Bundle bundle) {
        return Unit.INSTANCE;
    }
}
