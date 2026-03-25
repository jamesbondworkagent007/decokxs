package com.okinc.business.dex.trade.order.ui;

import androidx.lifecycle.ViewModelStoreOwner;
import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class OrdersPagerFragment$special$$inlined$viewModels$default$2 extends Lambda implements Function0<ViewModelStoreOwner> {
    public static int AEQbTJ;
    public static int EZpvd;
    final /* synthetic */ Function0 $ownerProducer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdersPagerFragment$special$$inlined$viewModels$default$2(Function0 function0) {
        super(0);
        this.$ownerProducer = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStoreOwner invoke() {
        return (ViewModelStoreOwner) this.$ownerProducer.invoke();
    }

    public static int AEQbTJ() {
        int i = AEQbTJ;
        int i2 = i % 6833741;
        AEQbTJ = i + 1;
        if (i2 != 0) {
            return EZpvd;
        }
        int iNextInt = new Random().nextInt();
        EZpvd = iNextInt;
        return iNextInt;
    }
}
