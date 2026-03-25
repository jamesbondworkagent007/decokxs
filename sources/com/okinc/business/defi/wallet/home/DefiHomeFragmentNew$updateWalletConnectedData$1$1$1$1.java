package com.okinc.business.defi.wallet.home;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectedData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.ActivityC18287ffZ;
import o.C15572eNh;
import o.C15935eaT;
import o.C16070ecw;
import o.C18348fgh;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$updateWalletConnectedData$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $iconsList;
    final /* synthetic */ ConstraintLayout $it;
    final /* synthetic */ List<String> $projectNamesList;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C15572eNh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$updateWalletConnectedData$1$1$1$1(List<String> list, List<String> list2, C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV, ConstraintLayout constraintLayout, Continuation<? super DefiHomeFragmentNew$updateWalletConnectedData$1$1$1$1> continuation) {
        super(2, continuation);
        this.$iconsList = list;
        this.$projectNamesList = list2;
        this.this$0 = c15572eNh;
        this.$wallet = abstractC12782ctV;
        this.$it = constraintLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$updateWalletConnectedData$1$1$1$1(this.$iconsList, this.$projectNamesList, this.this$0, this.$wallet, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$updateWalletConnectedData$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            if (this.$iconsList.size() == 1 && this.$projectNamesList.size() == 1) {
                C15935eaT c15935eaTDTwDnp = this.this$0.DTwDnp();
                String strDbNXlk = this.$wallet.DbNXlk();
                this.label = 1;
                obj = c15935eaTDTwDnp.EZpvd(strDbNXlk, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C15572eNh c15572eNh = this.this$0;
                ActivityC18287ffZ.ActionBar actionBar = ActivityC18287ffZ.Companion;
                Context context = this.$it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c15572eNh.startActivity(actionBar.copydefault(context, this.$wallet.DbNXlk()));
                return Unit.INSTANCE;
            }
        }
        Iterable<DAppSession> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (DAppSession dAppSession : iterable) {
            arrayList.add(new WalletConnectedData(3, dAppSession.getDAppInfo().getIcon(), dAppSession.getDAppInfo().getName(), dAppSession.getDAppInfo().getUrl(), dAppSession.getClientId()));
        }
        List<com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession> listKWHzl = this.this$0.QOLQEE().KWHzl(this.$wallet.DbNXlk());
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession dAppSession2 : listKWHzl) {
            arrayList2.add(new WalletConnectedData(2, dAppSession2.getManifest().getIconUrl(), dAppSession2.getManifest().getName(), dAppSession2.getManifest().getUrl(), dAppSession2.getClientId()));
        }
        List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) arrayList, (Iterable) arrayList2);
        List<WCSessionMeta> listAhwBna = this.this$0.QfsBiF().AhwBna(this.$wallet.DbNXlk());
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (WCSessionMeta wCSessionMeta : listAhwBna) {
            List<String> icons = wCSessionMeta.getIcons();
            String str = icons != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(icons) : null;
            String str2 = str == null ? "" : str;
            String projectName = wCSessionMeta.getProjectName();
            String url = wCSessionMeta.getUrl();
            String str3 = url == null ? "" : url;
            String topic = wCSessionMeta.getTopic();
            arrayList3.add(new WalletConnectedData(0, str2, projectName, str3, topic == null ? "" : topic));
        }
        Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(CollectionsKt___CollectionsKt.djBIcL((Collection) listDjBIcL, (Iterable) arrayList3));
        C15572eNh c15572eNh2 = this.this$0;
        WalletConnectedData walletConnectedData = (WalletConnectedData) objFirstOrNull;
        if (walletConnectedData != null) {
            int connectType = walletConnectedData.getConnectType();
            if (connectType == 2 || connectType == 3) {
                C16070ecw c16070ecwAEQbTJ = C16070ecw.Companion.AEQbTJ(walletConnectedData.getConnectType(), walletConnectedData.getTopicOrClientId());
                FragmentManager supportFragmentManager = c15572eNh2.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c16070ecwAEQbTJ.show(supportFragmentManager);
            } else {
                C18348fgh c18348fghEZpvd = C18348fgh.Companion.EZpvd(walletConnectedData.getTopicOrClientId());
                FragmentManager supportFragmentManager2 = c15572eNh2.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                c18348fghEZpvd.show(supportFragmentManager2);
            }
        }
        return Unit.INSTANCE;
    }
}
