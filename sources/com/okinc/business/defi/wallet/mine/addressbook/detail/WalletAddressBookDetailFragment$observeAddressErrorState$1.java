package com.okinc.business.defi.wallet.mine.addressbook.detail;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C16623enS;
import o.C18713fnb;
import o.C52761wXj;
import o.C55008xbo;
import o.C55113xdn;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletAddressBookDetailFragment$observeAddressErrorState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18713fnb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailFragment$observeAddressErrorState$1(C18713fnb c18713fnb, Continuation<? super WalletAddressBookDetailFragment$observeAddressErrorState$1> continuation) {
        super(2, continuation);
        this.this$0 = c18713fnb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBookDetailFragment$observeAddressErrorState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBookDetailFragment$observeAddressErrorState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<WalletAddressBookDetailViewModel.AddressInputFieldState> stateFlowKWHzl = this.this$0.gEmmrt().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeAddressErrorState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WalletAddressBookDetailViewModel.AddressInputFieldState, Continuation<? super Unit>, Object> {
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
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WalletAddressBookDetailViewModel.AddressInputFieldState addressInputFieldState, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(addressInputFieldState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ConstraintLayout constraintLayout;
            C55113xdn c55113xdn;
            C55008xbo c55008xbo;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletAddressBookDetailViewModel.AddressInputFieldState addressInputFieldState = (WalletAddressBookDetailViewModel.AddressInputFieldState) this.L$0;
                Context context = this.this$0.getContext();
                if (context == null) {
                    return Unit.INSTANCE;
                }
                if (Intrinsics.EZpvd(addressInputFieldState, WalletAddressBookDetailViewModel.AddressInputFieldState.Application.AEQbTJ)) {
                    C16623enS c16623enS = this.this$0.djBIcL;
                    if (c16623enS != null) {
                        c16623enS.AEQbTJ.values();
                        ConstraintLayout constraintLayout2 = c16623enS.values;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                        constraintLayout2.setVisibility(0);
                        c16623enS.values.setOnClickListener(null);
                        c16623enS.valueOf.KWHzl(0L);
                        TextView textView = c16623enS.fetchVPNInfo;
                        Intrinsics.checkNotNullExpressionValue(textView, "");
                        textView.setVisibility(8);
                        LinearLayout linearLayout = c16623enS.djBIcL;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                        linearLayout.setVisibility(8);
                        ImageView imageView = c16623enS.isConnected;
                        Intrinsics.checkNotNullExpressionValue(imageView, "");
                        imageView.setVisibility(8);
                    }
                } else if (Intrinsics.EZpvd(addressInputFieldState, WalletAddressBookDetailViewModel.AddressInputFieldState.StateListAnimator.OLrzqt)) {
                    C16623enS c16623enS2 = this.this$0.djBIcL;
                    if (c16623enS2 != null && (c55008xbo = c16623enS2.AEQbTJ) != null) {
                        c55008xbo.values();
                    }
                    C16623enS c16623enS3 = this.this$0.djBIcL;
                    if (c16623enS3 != null && (c55113xdn = c16623enS3.valueOf) != null) {
                        c55113xdn.copydefault();
                    }
                    C16623enS c16623enS4 = this.this$0.djBIcL;
                    if (c16623enS4 != null && (constraintLayout = c16623enS4.values) != null) {
                        constraintLayout.setVisibility(0);
                    }
                } else if (addressInputFieldState instanceof WalletAddressBookDetailViewModel.AddressInputFieldState.Activity) {
                    C18713fnb.KWHzl(this.this$0, ((WalletAddressBookDetailViewModel.AddressInputFieldState.Activity) addressInputFieldState).AEQbTJ());
                } else if (Intrinsics.EZpvd(addressInputFieldState, WalletAddressBookDetailViewModel.AddressInputFieldState.ActionBar.copydefault)) {
                    C16623enS c16623enS5 = this.this$0.djBIcL;
                    if (c16623enS5 != null) {
                        c16623enS5.AEQbTJ.values();
                        c16623enS5.valueOf.copydefault();
                        ConstraintLayout constraintLayout3 = c16623enS5.values;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                        constraintLayout3.setVisibility(0);
                        TextView textView2 = c16623enS5.fetchVPNInfo;
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        textView2.setVisibility(0);
                        c16623enS5.fetchVPNInfo.setTextColor(context.getColor(C52761wXj.Activity.fhUrPt));
                        c16623enS5.fetchVPNInfo.setText(context.getString(C13754dXa.FragmentManager.INotificationSideChannel_Parcel));
                        LinearLayout linearLayout2 = c16623enS5.djBIcL;
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                        linearLayout2.setVisibility(8);
                        ImageView imageView2 = c16623enS5.isConnected;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "");
                        imageView2.setVisibility(8);
                    }
                } else {
                    if (!(addressInputFieldState instanceof WalletAddressBookDetailViewModel.AddressInputFieldState.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strEZpvd = ((WalletAddressBookDetailViewModel.AddressInputFieldState.TaskDescription) addressInputFieldState).EZpvd();
                    if (strEZpvd != null) {
                        C55326xho.toast$default(strEZpvd, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
