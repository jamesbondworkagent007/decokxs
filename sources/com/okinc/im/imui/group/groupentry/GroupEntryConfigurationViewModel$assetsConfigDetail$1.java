package com.okinc.im.imui.group.groupentry;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel;
import com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType;
import com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerification;
import com.okinc.okimcore.model.remote.GroupEntryCreateVerificationRequestResponse;
import com.okinc.okimcore.model.remote.GroupEntryCurrency;
import com.okinc.okimcore.model.remote.GroupEntryCurrencyListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.C55276xgr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupEntryConfigurationViewModel$assetsConfigDetail$1 extends SuspendLambda implements yHT<GroupEntryCreateVerificationRequestResponse, GroupEntryAssetVerification, GroupEntryCurrencyListResponse, Continuation<? super GroupEntryConfigurationViewModel.StateListAnimator>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GroupEntryConfigurationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationViewModel$assetsConfigDetail$1(GroupEntryConfigurationViewModel groupEntryConfigurationViewModel, Continuation<? super GroupEntryConfigurationViewModel$assetsConfigDetail$1> continuation) {
        super(4, continuation);
        this.this$0 = groupEntryConfigurationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse, GroupEntryAssetVerification groupEntryAssetVerification, GroupEntryCurrencyListResponse groupEntryCurrencyListResponse, Continuation<? super GroupEntryConfigurationViewModel.StateListAnimator> continuation) {
        GroupEntryConfigurationViewModel$assetsConfigDetail$1 groupEntryConfigurationViewModel$assetsConfigDetail$1 = new GroupEntryConfigurationViewModel$assetsConfigDetail$1(this.this$0, continuation);
        groupEntryConfigurationViewModel$assetsConfigDetail$1.L$0 = groupEntryCreateVerificationRequestResponse;
        groupEntryConfigurationViewModel$assetsConfigDetail$1.L$1 = groupEntryAssetVerification;
        return groupEntryConfigurationViewModel$assetsConfigDetail$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        GroupEntryAssetVerificationType assetVerificationType;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupEntryCreateVerificationRequestResponse groupEntryCreateVerificationRequestResponse = (GroupEntryCreateVerificationRequestResponse) this.L$0;
            GroupEntryAssetVerification groupEntryAssetVerification = (GroupEntryAssetVerification) this.L$1;
            List<GroupEntryCurrency> listOLrzqt = this.this$0.OLrzqt(groupEntryAssetVerification != null ? groupEntryAssetVerification.getAssetVerificationType() : null);
            if (listOLrzqt != null) {
                arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (GroupEntryCurrency groupEntryCurrency : listOLrzqt) {
                    String currencyCode = groupEntryCurrency.getCurrencyCode();
                    String str = currencyCode == null ? "" : currencyCode;
                    String currencyFullName = groupEntryCurrency.getCurrencyFullName();
                    arrayList.add(new C55276xgr(str, groupEntryCurrency, currencyFullName == null ? "" : currencyFullName, Intrinsics.EZpvd(groupEntryAssetVerification != null ? groupEntryAssetVerification.getCurrencyId() : null, groupEntryCurrency.getCurrencyId()), false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
                }
            } else {
                arrayList = null;
            }
            GroupEntryCurrency groupEntryCurrencyAEQbTJ = this.this$0.AEQbTJ(groupEntryAssetVerification);
            Integer currencyId = groupEntryCurrencyAEQbTJ != null ? groupEntryCurrencyAEQbTJ.getCurrencyId() : null;
            GroupEntryAssetVerification groupEntryAssetVerification2 = (GroupEntryAssetVerification) this.this$0.AEQbTJ.getValue();
            GroupEntryAssetsVerificationStatus assetVerificationStatus = groupEntryAssetVerification2 != null ? groupEntryAssetVerification2.getAssetVerificationStatus() : null;
            GroupEntryAssetVerification groupEntryAssetVerification3 = (GroupEntryAssetVerification) this.this$0.AEQbTJ.getValue();
            if (groupEntryAssetVerification3 == null || (assetVerificationType = groupEntryAssetVerification3.getAssetVerificationType()) == null) {
                assetVerificationType = GroupEntryAssetVerificationType.ASSET;
            }
            GroupEntryAssetVerificationType groupEntryAssetVerificationType = assetVerificationType;
            GroupEntryAssetVerification groupEntryAssetVerification4 = (GroupEntryAssetVerification) this.this$0.AEQbTJ.getValue();
            return new GroupEntryConfigurationViewModel.StateListAnimator(groupEntryCreateVerificationRequestResponse != null ? groupEntryCreateVerificationRequestResponse.getAssetVerification() : null, new GroupEntryConfigurationViewModel.Activity(currencyId, assetVerificationStatus, groupEntryAssetVerificationType, groupEntryAssetVerification4 != null ? groupEntryAssetVerification4.getAssetAmount() : null, groupEntryCurrencyAEQbTJ != null ? groupEntryCurrencyAEQbTJ.getCurrencyCode() : null, groupEntryCurrencyAEQbTJ != null ? groupEntryCurrencyAEQbTJ.getCurrencyFullName() : null, groupEntryCurrencyAEQbTJ != null ? groupEntryCurrencyAEQbTJ.getMinAmount() : null, groupEntryCurrencyAEQbTJ != null ? groupEntryCurrencyAEQbTJ.getMaxAmount() : null, groupEntryCurrencyAEQbTJ != null ? groupEntryCurrencyAEQbTJ.getDecimalPoint() : null), arrayList);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
