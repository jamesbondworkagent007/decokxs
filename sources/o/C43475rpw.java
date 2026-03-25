package o;

import com.okinc.nft.nftmarket.NFTBridge;
import com.okinc.nft.nftmarket.NFTComplianceManagerBridge;
import com.okinc.nft.nftmarket.NFTDeepLinkBridge;
import com.okinc.nft.nftmarket.NftScanBridge;
import com.okinc.nft.push.NFTPushManager;
import com.okinc.nft.ui.NFTTapEngine;
import com.okinc.nft.ui.anim.UDRotate3dAnimation;
import com.okinc.nft.ui.custom.OkQRCodeView;
import com.okinc.nft.ui.kline.MLNKLineChart;
import com.okinc.nft.ui.kline.MLNKLineChartConfig;
import com.okinc.nft.ui.kline.MLNPixelLineChart;
import com.okinc.nft.ui.kline.bean.UDKLineCandleData;
import o.C7325ahh;
import o.C8010aue;

/* JADX INFO: renamed from: o.rpw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43475rpw extends AbstractC7372aib {
    @Override // o.InterfaceC7378aih
    public java.lang.Class<?>[] registerConstants() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.TaskDescription[] registerConverter() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.LoaderManager[] registerStaticClass() {
        return null;
    }

    @Override // o.InterfaceC7378aih
    public InterfaceC7380aij registerRouter() {
        return new C43474rpv();
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application(NFTBridge.LUA_CLASS_NAME, NFTBridge.class), new C7325ahh.Application(NFTDeepLinkBridge.LUA_CLASS_NAME, NFTDeepLinkBridge.class), new C7325ahh.Application(NFTPushManager.LUA_CLASS_NAME, NFTPushManager.class), new C7325ahh.Application(NftScanBridge.LUA_CLASS_NAME, NftScanBridge.class), new C7325ahh.Application(NFTComplianceManagerBridge.LUA_CLASS_NAME, NFTComplianceManagerBridge.class), new C7325ahh.Application("OKTapEngine", NFTTapEngine.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        return new C8010aue.AssistContent[]{new C8010aue.AssistContent("OKQRCodeView", OkQRCodeView.class, false, OkQRCodeView.AEQbTJ), C8010aue.OLrzqt("Rotate3dAnimation", UDRotate3dAnimation.class, false), new C8010aue.AssistContent("OKKLineChart", MLNKLineChart.class, false, MLNKLineChart.Companion.KWHzl()), new C8010aue.AssistContent("OKMatrixChartView", MLNPixelLineChart.class, false, MLNPixelLineChart.Companion.AEQbTJ()), new C8010aue.AssistContent(MLNKLineChartConfig.LUA_CLASS_NAME, MLNKLineChartConfig.class, false, false, MLNKLineChartConfig.methods), new C8010aue.AssistContent(UDKLineCandleData.LUA_CLASS_NAME, UDKLineCandleData.class, false, false, UDKLineCandleData.methods)};
    }
}
