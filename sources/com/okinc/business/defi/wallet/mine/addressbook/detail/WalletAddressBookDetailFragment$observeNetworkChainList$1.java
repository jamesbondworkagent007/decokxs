package com.okinc.business.defi.wallet.mine.addressbook.detail;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C16623enS;
import o.C18713fnb;
import o.C55298xhM;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletAddressBookDetailFragment$observeNetworkChainList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18713fnb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailFragment$observeNetworkChainList$1(C18713fnb c18713fnb, Continuation<? super WalletAddressBookDetailFragment$observeNetworkChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = c18713fnb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBookDetailFragment$observeNetworkChainList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBookDetailFragment$observeNetworkChainList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<List<AddressChainUiData>> stateFlowCopydefault = this.this$0.gEmmrt().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeNetworkChainList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends AddressChainUiData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18713fnb this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18713fnb c18713fnb, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18713fnb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AddressChainUiData> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AddressChainUiData>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AddressChainUiData> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<AddressChainUiData> list = (List) this.L$0;
                Context context = this.this$0.getContext();
                if (context == null) {
                    return Unit.INSTANCE;
                }
                if (list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                if (list.size() == 1) {
                    C16623enS c16623enS = this.this$0.djBIcL;
                    if (c16623enS != null) {
                        C18713fnb c18713fnb = this.this$0;
                        ConstraintLayout constraintLayout = c16623enS.values;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                        constraintLayout.setVisibility(0);
                        TextView textView = c16623enS.fetchVPNInfo;
                        Intrinsics.checkNotNullExpressionValue(textView, "");
                        textView.setVisibility(8);
                        LinearLayout linearLayout = c16623enS.djBIcL;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                        linearLayout.setVisibility(0);
                        ImageView imageView = c16623enS.isConnected;
                        Intrinsics.checkNotNullExpressionValue(imageView, "");
                        imageView.setVisibility(8);
                        c16623enS.djBIcL.setOrientation(0);
                        TextView textView2 = c16623enS.DbNXlk;
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.setMarginStart(C55298xhM.copydefault(8.0f, context));
                            marginLayoutParams.setMarginEnd(0);
                            marginLayoutParams.topMargin = 0;
                            marginLayoutParams.bottomMargin = 0;
                            textView2.setLayoutParams(marginLayoutParams);
                            c16623enS.DbNXlk.setText(((AddressChainUiData) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).EZpvd());
                            c16623enS.values.setOnClickListener(null);
                            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((AddressChainUiData) it.next()).copydefault());
                            }
                            c18713fnb.AEQbTJ((List<String>) arrayList);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    WalletAddressBookDetailViewModel walletAddressBookDetailViewModelGEmmrt = this.this$0.gEmmrt();
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (AddressChainUiData addressChainUiData : list) {
                        arrayList2.add(addressChainUiData.EZpvd((255 & 1) != 0 ? addressChainUiData.AEQbTJ : null, (255 & 2) != 0 ? addressChainUiData.EZpvd : 0L, (255 & 4) != 0 ? addressChainUiData.KWHzl : null, (255 & 8) != 0 ? addressChainUiData.gEmmrt : false, (255 & 16) != 0 ? addressChainUiData.AYXKKw : false, (255 & 32) != 0 ? addressChainUiData.OLrzqt : false, (255 & 64) != 0 ? addressChainUiData.copydefault : false, (255 & 128) != 0 ? addressChainUiData.AhwBna : true));
                    }
                    walletAddressBookDetailViewModelGEmmrt.OLrzqt(arrayList2);
                    return Unit.INSTANCE;
                }
                this.this$0.EZpvd((List<AddressChainUiData>) list);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
