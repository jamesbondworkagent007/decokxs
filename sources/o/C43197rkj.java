package o;

import com.okinc.annual.download.OKGrowthAnnualBillFileDownloader;
import com.okinc.annual.timepicker.UDGrowthDatePickerView;
import com.okinc.annual.video.UDGrowthVideoPlayerView;
import com.okinc.annual.view.UDGrowthPanView;
import com.okinc.annual.view.UDGrowthRecyclerView;
import com.okinc.mlnservice.shimmer.UDGrowthShimmerFrameLayout;
import com.okinc.mlnservice.singleinstance.OKGrowthBridge;
import com.okinc.mlnservice.singleinstance.OKGrowthMeasureBridge;
import com.okinc.mlnservice.singleinstance.OKGrowthUpgradeBridge;
import com.okinc.mlnservice.sse.OKGrowthSSETool;
import com.okinc.mlnservice.usdg.UDUSDGProgressCurveView;
import com.okinc.mlnservice.view.OKGrowthPlatformRichTextView;
import com.okinc.mlnservice.view.OKGrowthRichTextView;
import com.okinc.mlnservice.view.UDFlexboxLayout;
import com.okinc.wholesale.picker.GrowthImageUpload;
import o.C7325ahh;
import o.C8010aue;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.rkj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43197rkj extends AbstractC43215rlA implements InterfaceC7377aig {
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
        return new C43194rkg();
    }

    @Override // o.InterfaceC7378aih
    public C7325ahh.Application[] registerSingleInstance() {
        return new C7325ahh.Application[]{new C7325ahh.Application(OKGrowthBridge.LUA_CLASS_NAME, OKGrowthBridge.class), new C7325ahh.Application("OKGrowthUpgradeBridge", OKGrowthUpgradeBridge.class), new C7325ahh.Application(OKGrowthAnnualBillFileDownloader.LUA_CLASS_NAME, OKGrowthAnnualBillFileDownloader.class), new C7325ahh.Application("GrowthImageUpload", GrowthImageUpload.class), new C7325ahh.Application("OKGrowthMeasureBridge", OKGrowthMeasureBridge.class), new C7325ahh.Application("OKGrowthSSETool", OKGrowthSSETool.class)};
    }

    @Override // o.InterfaceC7378aih
    public C8010aue.AssistContent[] registerUserData() {
        java.lang.String str = OKGrowthRichTextView.EZpvd[0];
        java.lang.String[] strArr = OKGrowthRichTextView.AEQbTJ;
        C8010aue.AssistContent assistContentCopydefault = C8010aue.copydefault(str, (java.lang.Class<? extends LuaUserdata>) OKGrowthRichTextView.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        java.lang.String[] strArr2 = UDFlexboxLayout.copydefault;
        C8010aue.AssistContent assistContentCopydefault2 = C8010aue.copydefault("GrowthFlexboxLayout", (java.lang.Class<? extends LuaUserdata>) UDFlexboxLayout.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr2, strArr2.length));
        java.lang.String str2 = UDGrowthRecyclerView.OLrzqt[0];
        java.lang.String[] strArr3 = UDGrowthRecyclerView.AEQbTJ;
        C8010aue.AssistContent assistContentCopydefault3 = C8010aue.copydefault(str2, (java.lang.Class<? extends LuaUserdata>) UDGrowthRecyclerView.class, false, (java.lang.String[]) java.util.Arrays.copyOf(strArr3, strArr3.length));
        java.lang.String[] strArr4 = UDGrowthVideoPlayerView.AEQbTJ;
        C8010aue.AssistContent assistContentKWHzl = C8010aue.KWHzl("OKGrowthVideoPlayer", UDGrowthVideoPlayerView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArr4, strArr4.length));
        java.lang.String[] strArr5 = UDGrowthPanView.AEQbTJ;
        C8010aue.AssistContent assistContentKWHzl2 = C8010aue.KWHzl("OKGrowthPanView", UDGrowthPanView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArr5, strArr5.length));
        java.lang.String[] strArr6 = UDGrowthDatePickerView.KWHzl;
        C8010aue.AssistContent assistContentKWHzl3 = C8010aue.KWHzl("OKGrowthDatePickerView", UDGrowthDatePickerView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArr6, strArr6.length));
        java.lang.String[] strArr7 = UDGrowthShimmerFrameLayout.EZpvd;
        C8010aue.AssistContent assistContentKWHzl4 = C8010aue.KWHzl("OKGrowthShimmerView", UDGrowthShimmerFrameLayout.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArr7, strArr7.length));
        C8010aue.AssistContent assistContent = new C8010aue.AssistContent("OKGrowthPlatformRichTextView", OKGrowthPlatformRichTextView.class, false, true, OKGrowthPlatformRichTextView.Companion.EZpvd());
        java.lang.String[] strArr8 = UDUSDGProgressCurveView.AEQbTJ;
        return new C8010aue.AssistContent[]{assistContentCopydefault, assistContentCopydefault2, assistContentCopydefault3, assistContentKWHzl, assistContentKWHzl2, assistContentKWHzl3, assistContentKWHzl4, assistContent, C8010aue.KWHzl("OKGrowthProgressCurveView", UDUSDGProgressCurveView.class, false, true, (java.lang.String[]) java.util.Arrays.copyOf(strArr8, strArr8.length))};
    }
}
