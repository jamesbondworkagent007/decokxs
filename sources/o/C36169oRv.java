package o;

import com.okinc.kline.data.BotOrderItem;
import com.okinc.kline.data.BotPendingLineVo;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oRv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36169oRv implements InterfaceC49405unt<BotGridOrderDialogData, BotPendingLineVo> {
    @yCM
    public C36169oRv() {
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public BotPendingLineVo EZpvd(@NotNull BotGridOrderDialogData botGridOrderDialogData) {
        return (BotPendingLineVo) InterfaceC49405unt.Activity.EZpvd(this, botGridOrderDialogData);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public BotPendingLineVo AEQbTJ(@NotNull BotGridOrderDialogData botGridOrderDialogData) {
        Intrinsics.checkNotNullParameter(botGridOrderDialogData, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str : botGridOrderDialogData.getOrderLine().getLines()) {
            if (C33129mqd.AEQbTJ(botGridOrderDialogData.getTickerPrice(), botGridOrderDialogData.getMaxPx())) {
                arrayList.add(0, new BotOrderItem(str, null, 2, null));
            } else if (C33129mqd.gEmmrt(botGridOrderDialogData.getTickerPrice(), botGridOrderDialogData.getMinPx())) {
                arrayList2.add(new BotOrderItem(str, null, 2, null));
            } else if (C33129mqd.AEQbTJ(str, botGridOrderDialogData.getTickerPrice())) {
                arrayList2.add(new BotOrderItem(str, null, 2, null));
            } else {
                arrayList.add(0, new BotOrderItem(str, null, 2, null));
            }
        }
        return new BotPendingLineVo(botGridOrderDialogData.getOrderLine().getBotType(), botGridOrderDialogData.getOrderLine().getDirection(), arrayList, arrayList2, null, null, null, null, null, null, null, botGridOrderDialogData.getMinPx(), botGridOrderDialogData.getMaxPx(), 2032, null);
    }
}
