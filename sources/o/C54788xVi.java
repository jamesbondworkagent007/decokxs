package o;

import com.okinc.unify_trade.net.BizApiService;
import com.okinc.unify_trade.net.BotApiService;
import com.okinc.unify_trade.net.TradeApiService;
import io.mockk.MockK;
import io.mockk.MockKDsl;
import io.mockk.MockKGateway;
import io.mockk.impl.JvmMockKGateway;

/* JADX INFO: renamed from: o.xVi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54788xVi {
    public static final C54788xVi AEQbTJ = new C54788xVi();
    public static final int EZpvd;
    public static BizApiService KWHzl;
    public static BotApiService OLrzqt;
    public static TradeApiService copydefault;

    private C54788xVi() {
    }

    static {
        MockK mockK = MockK.INSTANCE;
        MockKGateway.Companion.setImplementation(JvmMockKGateway.Companion.getDefaultImplementationBuilder());
        MockKDsl mockKDsl = MockKDsl.INSTANCE;
        KWHzl = (BizApiService) ((MockKGateway) MockKGateway.Companion.getImplementation().invoke()).getMockFactory().mockk(C56524yIo.AEQbTJ(BizApiService.class), (java.lang.String) null, true, (InterfaceC56551yJo[]) java.util.Arrays.copyOf(new InterfaceC56551yJo[0], 0), false);
        MockK mockK2 = MockK.INSTANCE;
        MockKGateway.Companion.setImplementation(JvmMockKGateway.Companion.getDefaultImplementationBuilder());
        MockKDsl mockKDsl2 = MockKDsl.INSTANCE;
        OLrzqt = (BotApiService) ((MockKGateway) MockKGateway.Companion.getImplementation().invoke()).getMockFactory().mockk(C56524yIo.AEQbTJ(BotApiService.class), (java.lang.String) null, true, (InterfaceC56551yJo[]) java.util.Arrays.copyOf(new InterfaceC56551yJo[0], 0), false);
        MockK mockK3 = MockK.INSTANCE;
        MockKGateway.Companion.setImplementation(JvmMockKGateway.Companion.getDefaultImplementationBuilder());
        MockKDsl mockKDsl3 = MockKDsl.INSTANCE;
        copydefault = (TradeApiService) ((MockKGateway) MockKGateway.Companion.getImplementation().invoke()).getMockFactory().mockk(C56524yIo.AEQbTJ(TradeApiService.class), (java.lang.String) null, true, (InterfaceC56551yJo[]) java.util.Arrays.copyOf(new InterfaceC56551yJo[0], 0), false);
        EZpvd = 8;
    }
}
