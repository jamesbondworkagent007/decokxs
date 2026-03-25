package com.okinc.business.defi.wallet.home;

import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C14726dqr;
import o.C15572eNh;
import o.C15935eaT;
import o.C16749epm;
import o.C55296xhK;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$updateWalletConnectedData$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16749epm $this_apply;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C15572eNh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$updateWalletConnectedData$1$1(C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV, C16749epm c16749epm, Continuation<? super DefiHomeFragmentNew$updateWalletConnectedData$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c15572eNh;
        this.$wallet = abstractC12782ctV;
        this.$this_apply = c16749epm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$updateWalletConnectedData$1$1(this.this$0, this.$wallet, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$updateWalletConnectedData$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ List EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ AbstractC12782ctV OLrzqt;
        public final /* synthetic */ List copydefault;
        public final /* synthetic */ C15572eNh djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, C15572eNh c15572eNh, List list, List list2, AbstractC12782ctV abstractC12782ctV) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.djBIcL = c15572eNh;
            this.copydefault = list;
            this.EZpvd = list2;
            this.OLrzqt = abstractC12782ctV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.AEQbTJ;
                LifecycleOwner viewLifecycleOwner = this.djBIcL.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiHomeFragmentNew$updateWalletConnectedData$1$1$1$1(this.copydefault, this.EZpvd, this.djBIcL, this.OLrzqt, constraintLayout, null), 3, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[LOOP:0: B:18:0x0081->B:20:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[LOOP:1: B:22:0x00a6->B:24:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[LOOP:3: B:37:0x0104->B:39:0x010a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f A[LOOP:4: B:41:0x0129->B:43:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158 A[LOOP:5: B:45:0x0152->B:47:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3 A[EDGE_INSN: B:60:0x00f3->B:36:0x00f3 BREAK  A[LOOP:2: B:26:0x00cf->B:35:0x00ef], SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        List list;
        Object objEZpvd;
        List<DAppSession> list2;
        Iterator it;
        Iterator<T> it2;
        ArrayList arrayList;
        Iterator it3;
        String str;
        Iterator it4;
        Iterator<T> it5;
        Iterator it6;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletConnectUtils walletConnectUtilsQfsBiF = this.this$0.QfsBiF();
            String strDbNXlk = this.$wallet.DbNXlk();
            this.label = 1;
            objCopydefault = walletConnectUtilsQfsBiF.copydefault(strDbNXlk, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                List list3 = (List) objEZpvd;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) it.next()).getDAppInfo().getIcon());
                }
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((DAppSession) it2.next()).getManifest().getIconUrl());
                }
                List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) arrayList2, (Iterable) arrayList3);
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                it3 = list.iterator();
                while (true) {
                    str = "";
                    if (it3.hasNext()) {
                        break;
                    }
                    List<String> icons = ((WCSessionMeta) it3.next()).getIcons();
                    String str2 = icons != null ? (String) CollectionsKt___CollectionsKt.firstOrNull(icons) : null;
                    if (str2 != null) {
                        str = str2;
                    }
                    arrayList.add(str);
                }
                List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((Collection) listDjBIcL, (Iterable) arrayList);
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(list3, 10));
                it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession) it4.next()).getDAppInfo().getName());
                }
                ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((DAppSession) it5.next()).getManifest().getName());
                }
                List listDjBIcL3 = CollectionsKt___CollectionsKt.djBIcL((Collection) arrayList4, (Iterable) arrayList5);
                ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                it6 = list.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(((WCSessionMeta) it6.next()).getProjectName());
                }
                List listDjBIcL4 = CollectionsKt___CollectionsKt.djBIcL((Collection) listDjBIcL3, (Iterable) arrayList6);
                C14726dqr.OLrzqt.KWHzl(this.$this_apply.OLrzqt, listDjBIcL2, (64 & 4) != 0 ? 20 : 26, (64 & 8) != 0 ? 6 : 6, (64 & 16) != 0 ? 2.0f : 1.0f, (64 & 32) != 0 ? 26.0f : 0.0f, (64 & 64) != 0 ? 4 : 4);
                AppCompatTextView appCompatTextView = this.$this_apply.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                appCompatTextView.setVisibility(listDjBIcL4.size() > 1 ? 0 : 8);
                AppCompatTextView appCompatTextView2 = this.$this_apply.AEQbTJ;
                String str3 = (String) CollectionsKt___CollectionsKt.firstOrNull(listDjBIcL4);
                appCompatTextView2.setText(str3 != null ? str3 : "");
                ConstraintLayout constraintLayout = this.$this_apply.EZpvd;
                constraintLayout.setOnClickListener(new Activity(constraintLayout, 1000L, this.this$0, listDjBIcL2, listDjBIcL4, this.$wallet));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        list = (List) objCopydefault;
        List<DAppSession> listKWHzl = this.this$0.QOLQEE().KWHzl(this.$wallet.DbNXlk());
        C15935eaT c15935eaTDTwDnp = this.this$0.DTwDnp();
        String strDbNXlk2 = this.$wallet.DbNXlk();
        this.L$0 = list;
        this.L$1 = listKWHzl;
        this.label = 2;
        objEZpvd = c15935eaTDTwDnp.EZpvd(strDbNXlk2, this);
        if (objEZpvd == objCopydefault2) {
            return objCopydefault2;
        }
        list2 = listKWHzl;
        List list32 = (List) objEZpvd;
        ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(list32, 10));
        it = list32.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
        it2 = list2.iterator();
        while (it2.hasNext()) {
        }
        List listDjBIcL5 = CollectionsKt___CollectionsKt.djBIcL((Collection) arrayList22, (Iterable) arrayList32);
        arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        it3 = list.iterator();
        while (true) {
            str = "";
            if (it3.hasNext()) {
            }
            arrayList.add(str);
        }
        List listDjBIcL22 = CollectionsKt___CollectionsKt.djBIcL((Collection) listDjBIcL5, (Iterable) arrayList);
        ArrayList arrayList42 = new ArrayList(C56403yEb.AYXKKw(list32, 10));
        it4 = list32.iterator();
        while (it4.hasNext()) {
        }
        ArrayList arrayList52 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
        it5 = list2.iterator();
        while (it5.hasNext()) {
        }
        List listDjBIcL32 = CollectionsKt___CollectionsKt.djBIcL((Collection) arrayList42, (Iterable) arrayList52);
        ArrayList arrayList62 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        it6 = list.iterator();
        while (it6.hasNext()) {
        }
        List listDjBIcL42 = CollectionsKt___CollectionsKt.djBIcL((Collection) listDjBIcL32, (Iterable) arrayList62);
        C14726dqr.OLrzqt.KWHzl(this.$this_apply.OLrzqt, listDjBIcL22, (64 & 4) != 0 ? 20 : 26, (64 & 8) != 0 ? 6 : 6, (64 & 16) != 0 ? 2.0f : 1.0f, (64 & 32) != 0 ? 26.0f : 0.0f, (64 & 64) != 0 ? 4 : 4);
        AppCompatTextView appCompatTextView3 = this.$this_apply.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        appCompatTextView3.setVisibility(listDjBIcL42.size() > 1 ? 0 : 8);
        AppCompatTextView appCompatTextView22 = this.$this_apply.AEQbTJ;
        String str32 = (String) CollectionsKt___CollectionsKt.firstOrNull(listDjBIcL42);
        appCompatTextView22.setText(str32 != null ? str32 : "");
        ConstraintLayout constraintLayout2 = this.$this_apply.EZpvd;
        constraintLayout2.setOnClickListener(new Activity(constraintLayout2, 1000L, this.this$0, listDjBIcL22, listDjBIcL42, this.$wallet));
        return Unit.INSTANCE;
    }
}
