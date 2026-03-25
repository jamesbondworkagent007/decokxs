package o;

import com.google.gson.GsonBuilder;
import com.okinc.business.defi.api.bean.NftPrice;
import com.okinc.business.defi.biz.database.wallet.entity.WalletNftEntity;
import com.okinc.business.defi.biz.net.bean.NftBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10528bqE extends AbstractC10406bnp implements InterfaceC9744bbP {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public final java.lang.String AhwBna;
    public NftPrice KWHzl;
    public long OLrzqt;
    public final java.lang.String djBIcL;
    public int fetchVPNInfo;
    public final AbstractC12782ctV gEmmrt;
    public final NftBean valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9744bbP
    public java.lang.String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftPrice KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9744bbP
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9744bbP
    public java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC10406bnp, o.InterfaceC9742bbN
    public long gEmmrt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftBean valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC10406bnp
    public AbstractC12782ctV values() {
        return this.gEmmrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10528bqE(@NotNull NftBean nftBean, @NotNull AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strAYXKKw;
        super(abstractC12782ctV);
        Intrinsics.checkNotNullParameter(nftBean, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.valueOf = nftBean;
        this.gEmmrt = abstractC12782ctV;
        this.djBIcL = nftBean.getName();
        this.AhwBna = nftBean.getNetwork();
        this.AEQbTJ = nftBean.getLogo();
        java.lang.Integer project = nftBean.getProject();
        this.values = (project == null || (strAYXKKw = C33129mqd.AYXKKw(project)) == null) ? "0" : strAYXKKw;
        java.lang.Integer total = nftBean.getTotal();
        this.fetchVPNInfo = total != null ? C33129mqd.AhwBna(total) : 0;
        this.KWHzl = nftBean.getFloorSalePrice();
        java.lang.Boolean owner = nftBean.getOwner();
        this.AYXKKw = owner != null ? owner.booleanValue() : false;
        this.OLrzqt = nftBean.getGeneralChainId();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bwN.formatNftTotalPrice$default(o.bwN, java.lang.String, boolean, boolean, boolean, int, java.lang.Object):java.lang.String */
    public final java.lang.String OLrzqt(boolean z) {
        NftPrice nftPriceKWHzl = KWHzl();
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.OLrzqt(nftPriceKWHzl != null ? nftPriceKWHzl.getUsdPrice() : null, java.lang.Integer.valueOf(this.fetchVPNInfo)), false, null, null, 7, null);
        return z ? C10855bwN.formatNftTotalPrice$default(C10855bwN.OLrzqt, strConvertToString$default, false, false, false, 14, null) : strConvertToString$default;
    }

    public java.lang.String djBIcL() {
        return C10953byF.KWHzl.EZpvd(AEQbTJ(), copydefault(), this.values);
    }

    public final WalletNftEntity EZpvd() {
        java.lang.String strDbNXlk = values().DbNXlk();
        java.lang.String strDjBIcL = djBIcL();
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(this.valueOf);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return new WalletNftEntity(strDbNXlk, strDjBIcL, json);
    }

    /* JADX INFO: renamed from: o.bqE$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bqE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C10528bqE EZpvd(@NotNull NftBean nftBean, @NotNull AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(nftBean, "");
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            return new C10528bqE(nftBean, abstractC12782ctV);
        }
    }
}
