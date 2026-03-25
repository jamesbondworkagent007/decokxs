package com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.TransferAddressData;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$10;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressWithMemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ActivityC20883gpL;
import o.ActivityC20923gpz;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C9694baS;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletMultiTransferInputAddressActivity$observeData$10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC20923gpz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMultiTransferInputAddressActivity$observeData$10(ActivityC20923gpz activityC20923gpz, Continuation<? super DefiWalletMultiTransferInputAddressActivity$observeData$10> continuation) {
        super(2, continuation);
        this.this$0 = activityC20923gpz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMultiTransferInputAddressActivity$observeData$10(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMultiTransferInputAddressActivity$observeData$10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$10$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC20923gpz this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC20923gpz activityC20923gpz, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC20923gpz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$10$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03221 extends SuspendLambda implements Function2<Pair<? extends ArrayList<AddressWithMemo>, ? extends List<? extends String>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC20923gpz this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03221(ActivityC20923gpz activityC20923gpz, Continuation<? super C03221> continuation) {
                super(2, continuation);
                this.this$0 = activityC20923gpz;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03221 c03221 = new C03221(this.this$0, continuation);
                c03221.L$0 = obj;
                return c03221;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Pair<? extends ArrayList<AddressWithMemo>, ? extends List<? extends String>> pair, Continuation<? super Unit> continuation) {
                return invoke2((Pair<? extends ArrayList<AddressWithMemo>, ? extends List<String>>) pair, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Pair<? extends ArrayList<AddressWithMemo>, ? extends List<String>> pair, Continuation<? super Unit> continuation) {
                return ((C03221) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Intent intentAEQbTJ = ActivityC20883gpL.Companion.AEQbTJ(this.this$0, (ArrayList) ((Pair) this.L$0).getFirst(), this.this$0.copydefault((List<String>) r5.getSecond()));
                    C9694baS.Application application = C9694baS.Companion;
                    final ActivityC20923gpz activityC20923gpz = this.this$0;
                    application.EZpvd(activityC20923gpz, intentAEQbTJ, new Function2() { // from class: o.gpF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return DefiWalletMultiTransferInputAddressActivity$observeData$10.AnonymousClass1.C03221.invokeSuspend$lambda$5(activityC20923gpz, ((java.lang.Integer) obj2).intValue(), (android.content.Intent) obj3);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x019e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final Unit invokeSuspend$lambda$5(ActivityC20923gpz activityC20923gpz, int i, Intent intent) {
                Bundle extras;
                List parcelableArrayList;
                Bundle extras2;
                MultiTransferSignData multiTransferSignData;
                Integer numValueOf;
                Bundle extras3;
                Bundle extras4;
                if (i == 0) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 33) {
                        parcelableArrayList = (intent == null || (extras4 = intent.getExtras()) == null) ? null : extras4.getParcelableArrayList("address_list", AddressWithMemo.class);
                        if (parcelableArrayList == null) {
                            parcelableArrayList = yDY.AhwBna();
                        }
                        ArrayList arrayList = new ArrayList(parcelableArrayList);
                        if (i2 < 33) {
                            multiTransferSignData = (intent == null || (extras3 = intent.getExtras()) == null) ? null : (MultiTransferSignData) extras3.getParcelable("data", MultiTransferSignData.class);
                            if (multiTransferSignData != null) {
                                activityC20923gpz.AEQbTJ().AEQbTJ((List<AddressWithMemo>) arrayList);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                MultiTransferSignData multiTransferSignDataFetchVPNInfo = activityC20923gpz.AEQbTJ().fetchVPNInfo();
                                if (multiTransferSignDataFetchVPNInfo == null || multiTransferSignDataFetchVPNInfo.getTransferType() != 2) {
                                    int i3 = 0;
                                    for (Object obj : activityC20923gpz.AEQbTJ().AkhnZx()) {
                                        if (i3 < 0) {
                                            yDY.AYXKKw();
                                        }
                                        ArrayList<TransferAddressData> toAddress = multiTransferSignData.getToAddress();
                                        if (toAddress != null) {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj2 : toAddress) {
                                                if (((TransferAddressData) obj2).getIndex() == i3) {
                                                    arrayList3.add(obj2);
                                                }
                                            }
                                            numValueOf = Integer.valueOf(arrayList3.size());
                                        } else {
                                            numValueOf = null;
                                        }
                                        if (C33129mqd.valueOf(numValueOf, 0)) {
                                            arrayList2.add(Integer.valueOf(i3));
                                        }
                                        i3++;
                                    }
                                    Collections.sort(arrayList2, Comparator.reverseOrder());
                                }
                                if (!arrayList2.isEmpty()) {
                                    activityC20923gpz.AEQbTJ().copydefault((List<Integer>) arrayList2, true);
                                } else {
                                    ArrayList<TransferAddressData> toAddress2 = multiTransferSignData.getToAddress();
                                    ArrayList<TransferAddressData> arrayList4 = new ArrayList();
                                    for (Object obj3 : toAddress2) {
                                        String memo = ((TransferAddressData) obj3).getMemo();
                                        if (memo != null && memo.length() > 0) {
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(arrayList4, 10));
                                    for (TransferAddressData transferAddressData : arrayList4) {
                                        String address = transferAddressData.getAddress();
                                        String memo2 = transferAddressData.getMemo();
                                        if (memo2 == null) {
                                            memo2 = "";
                                        }
                                        arrayList5.add(new AddressWithMemo(address, memo2, false, transferAddressData.getIndex()));
                                    }
                                    activityC20923gpz.AEQbTJ().AEQbTJ((List<AddressWithMemo>) arrayList5);
                                }
                                MultiTransferSignData multiTransferSignDataFetchVPNInfo2 = activityC20923gpz.AEQbTJ().fetchVPNInfo();
                                if (multiTransferSignDataFetchVPNInfo2 == null || multiTransferSignDataFetchVPNInfo2.getTransferType() != 1) {
                                    ArrayList<String> fromAddress = multiTransferSignData.getFromAddress();
                                    if (fromAddress == null) {
                                        fromAddress = new ArrayList<>();
                                    }
                                    ArrayList<String> walletId = multiTransferSignData.getWalletId();
                                    if (walletId == null) {
                                        walletId = new ArrayList<>();
                                    }
                                    if (C33129mqd.KWHzl((Collection) fromAddress) && C33129mqd.KWHzl((Collection) walletId)) {
                                        MultiTransferSignData multiTransferSignDataFetchVPNInfo3 = activityC20923gpz.AEQbTJ().fetchVPNInfo();
                                        if (multiTransferSignDataFetchVPNInfo3 != null) {
                                            multiTransferSignDataFetchVPNInfo3.setFromAddress(fromAddress);
                                        }
                                        MultiTransferSignData multiTransferSignDataFetchVPNInfo4 = activityC20923gpz.AEQbTJ().fetchVPNInfo();
                                        if (multiTransferSignDataFetchVPNInfo4 != null) {
                                            multiTransferSignDataFetchVPNInfo4.setWalletId(walletId);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (intent != null && (extras2 = intent.getExtras()) != null) {
                                multiTransferSignData = (MultiTransferSignData) extras2.getParcelable("data");
                            }
                            if (multiTransferSignData != null) {
                            }
                        }
                    } else {
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            parcelableArrayList = extras.getParcelableArrayList("address_list");
                        }
                        if (parcelableArrayList == null) {
                        }
                        ArrayList arrayList6 = new ArrayList(parcelableArrayList);
                        if (i2 < 33) {
                        }
                    }
                }
                if (i == -1) {
                    activityC20923gpz.setResult(i, intent);
                    activityC20923gpz.finish();
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<Pair<ArrayList<AddressWithMemo>, List<String>>> flowFIwbmz = this.this$0.AEQbTJ().fIwbmz();
                C03221 c03221 = new C03221(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFIwbmz, c03221, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC20923gpz activityC20923gpz = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC20923gpz, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC20923gpz, state, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
