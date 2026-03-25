package com.okinc.business.defi.assets.utxo.utxoconfirmation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationContext;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationRequest;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationRequestItem;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponse;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponseItem;
import com.okinc.business.invest_api.bean.InvestUtxoConfirmationItem;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC10347bmj;
import o.AbstractC43419rot;
import o.ActivityC10272blN;
import o.C10274blP;
import o.C10275blQ;
import o.C10350bmm;
import o.C13754dXa;
import o.C13934dbu;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class UTXOConfirmationUtil$handleUtxoConfirmation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ long $coinId;
    final /* synthetic */ UtxoConfirmationContext $confirmationContext;
    final /* synthetic */ Context $context;
    final /* synthetic */ FragmentActivity $dialogFragmentActivity;
    final /* synthetic */ boolean $isNftListing;
    final /* synthetic */ Integer $txType;
    final /* synthetic */ List<InvestUtxoConfirmationItem> $utxoList;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTXOConfirmationUtil$handleUtxoConfirmation$1(List<InvestUtxoConfirmationItem> list, long j, Integer num, String str, FragmentActivity fragmentActivity, Context context, boolean z, UtxoConfirmationContext utxoConfirmationContext, Continuation<? super UTXOConfirmationUtil$handleUtxoConfirmation$1> continuation) {
        super(2, continuation);
        this.$utxoList = list;
        this.$coinId = j;
        this.$txType = num;
        this.$address = str;
        this.$dialogFragmentActivity = fragmentActivity;
        this.$context = context;
        this.$isNftListing = z;
        this.$confirmationContext = utxoConfirmationContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UTXOConfirmationUtil$handleUtxoConfirmation$1(this.$utxoList, this.$coinId, this.$txType, this.$address, this.$dialogFragmentActivity, this.$context, this.$isNftListing, this.$confirmationContext, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UTXOConfirmationUtil$handleUtxoConfirmation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<InvestUtxoConfirmationItem> list;
        long j;
        Integer num;
        FragmentActivity fragmentActivity;
        Context context;
        Object objAEQbTJ;
        boolean z;
        UtxoConfirmationContext utxoConfirmationContext;
        Context context2;
        String str;
        List<UtxoConfirmationResponseItem> listKWHzl;
        AbstractC43419rot abstractC43419rot;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                j = this.J$0;
                utxoConfirmationContext = (UtxoConfirmationContext) this.L$4;
                context = (Context) this.L$3;
                fragmentActivity = (FragmentActivity) this.L$2;
                num = (Integer) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
            } else {
                C56391yDq.AEQbTJ(obj);
                list = this.$utxoList;
                j = this.$coinId;
                num = this.$txType;
                String str2 = this.$address;
                fragmentActivity = this.$dialogFragmentActivity;
                context = this.$context;
                boolean z2 = this.$isNftListing;
                UtxoConfirmationContext utxoConfirmationContext2 = this.$confirmationContext;
                Result.Application application = Result.Companion;
                C13934dbu c13934dbu = new C13934dbu();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (InvestUtxoConfirmationItem investUtxoConfirmationItem : list) {
                    arrayList.add(new UtxoConfirmationRequestItem(investUtxoConfirmationItem.copydefault(), investUtxoConfirmationItem.gEmmrt(), investUtxoConfirmationItem.AEQbTJ(), investUtxoConfirmationItem.AhwBna(), investUtxoConfirmationItem.OLrzqt(), investUtxoConfirmationItem.EZpvd()));
                }
                UtxoConfirmationRequest utxoConfirmationRequest = new UtxoConfirmationRequest(arrayList, j, num, str2);
                this.L$0 = list;
                this.L$1 = num;
                this.L$2 = fragmentActivity;
                this.L$3 = context;
                this.L$4 = utxoConfirmationContext2;
                this.J$0 = j;
                this.Z$0 = z2;
                this.label = 1;
                objAEQbTJ = c13934dbu.AEQbTJ(utxoConfirmationRequest, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                z = z2;
                utxoConfirmationContext = utxoConfirmationContext2;
            }
            AbstractC43419rot abstractC43419rot2 = (AbstractC43419rot) objAEQbTJ;
            if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
                UtxoConfirmationResponse utxoConfirmationResponse = (UtxoConfirmationResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot2).KWHzl();
                List<UtxoConfirmationResponseItem> listOLrzqt = utxoConfirmationResponse.OLrzqt();
                if ((listOLrzqt == null || listOLrzqt.isEmpty()) && ((listKWHzl = utxoConfirmationResponse.KWHzl()) == null || listKWHzl.isEmpty())) {
                    context2 = context;
                    abstractC43419rot = abstractC43419rot2;
                    str = "";
                    C10350bmm.AEQbTJ.AEQbTJ(AbstractC10347bmj.Application.KWHzl);
                } else {
                    abstractC43419rot = abstractC43419rot2;
                    if (fragmentActivity == null) {
                        UtxoConfirmationContext utxoConfirmationContext3 = utxoConfirmationContext;
                        Intent intent = new Intent(context, (Class<?>) ActivityC10272blN.class);
                        intent.addFlags(268435456);
                        intent.putExtra("coinId", j);
                        intent.putExtra("txType", num);
                        intent.putExtra("isNFTListing", z);
                        intent.putExtra("count", list.size());
                        List<UtxoConfirmationResponseItem> listOLrzqt2 = utxoConfirmationResponse.OLrzqt();
                        if (listOLrzqt2 == null) {
                            listOLrzqt2 = yDY.AhwBna();
                        }
                        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                        for (UtxoConfirmationResponseItem utxoConfirmationResponseItem : listOLrzqt2) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it.next();
                                InvestUtxoConfirmationItem investUtxoConfirmationItem2 = (InvestUtxoConfirmationItem) next4;
                                int iGEmmrt = investUtxoConfirmationItem2.gEmmrt();
                                Integer numOLrzqt = utxoConfirmationResponseItem.OLrzqt();
                                if (numOLrzqt != null && iGEmmrt == numOLrzqt.intValue() && Intrinsics.EZpvd((Object) investUtxoConfirmationItem2.copydefault(), (Object) utxoConfirmationResponseItem.AEQbTJ())) {
                                    break;
                                }
                            }
                            InvestUtxoConfirmationItem investUtxoConfirmationItem3 = (InvestUtxoConfirmationItem) next4;
                            utxoConfirmationResponseItem.EZpvd(investUtxoConfirmationItem3 != null ? investUtxoConfirmationItem3.KWHzl() : null);
                            arrayList2.add(utxoConfirmationResponseItem);
                        }
                        intent.putParcelableArrayListExtra("useUtxoList", arrayList2);
                        List<UtxoConfirmationResponseItem> listKWHzl2 = utxoConfirmationResponse.KWHzl();
                        if (listKWHzl2 == null) {
                            listKWHzl2 = yDY.AhwBna();
                        }
                        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                        for (UtxoConfirmationResponseItem utxoConfirmationResponseItem2 : listKWHzl2) {
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it2.next();
                                InvestUtxoConfirmationItem investUtxoConfirmationItem4 = (InvestUtxoConfirmationItem) next3;
                                int iGEmmrt2 = investUtxoConfirmationItem4.gEmmrt();
                                Integer numOLrzqt2 = utxoConfirmationResponseItem2.OLrzqt();
                                if (numOLrzqt2 != null && iGEmmrt2 == numOLrzqt2.intValue() && Intrinsics.EZpvd((Object) investUtxoConfirmationItem4.copydefault(), (Object) utxoConfirmationResponseItem2.AEQbTJ())) {
                                    break;
                                }
                            }
                            InvestUtxoConfirmationItem investUtxoConfirmationItem5 = (InvestUtxoConfirmationItem) next3;
                            utxoConfirmationResponseItem2.EZpvd(investUtxoConfirmationItem5 != null ? investUtxoConfirmationItem5.KWHzl() : null);
                            arrayList3.add(utxoConfirmationResponseItem2);
                        }
                        intent.putParcelableArrayListExtra("gasUtxoList", arrayList3);
                        intent.putExtra("utxo.confirmation.context", utxoConfirmationContext3);
                        context.startActivity(intent);
                        context2 = context;
                        str = "";
                    } else {
                        context2 = context;
                        C10274blP c10274blP = new C10274blP();
                        FragmentActivity fragmentActivity2 = fragmentActivity;
                        C10275blQ.ActionBar actionBar = C10275blQ.Companion;
                        Bundle bundle = new Bundle();
                        UtxoConfirmationContext utxoConfirmationContext4 = utxoConfirmationContext;
                        bundle.putBoolean("isDialog", true);
                        bundle.putLong("coinId", j);
                        if (num != null) {
                            bundle.putInt("txType", num.intValue());
                            Unit unit = Unit.INSTANCE;
                        }
                        bundle.putBoolean("isNFTListing", z);
                        bundle.putInt("count", list.size());
                        List<UtxoConfirmationResponseItem> listOLrzqt3 = utxoConfirmationResponse.OLrzqt();
                        if (listOLrzqt3 == null) {
                            listOLrzqt3 = yDY.AhwBna();
                        }
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        for (UtxoConfirmationResponseItem utxoConfirmationResponseItem3 : listOLrzqt3) {
                            Iterator<T> it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                                InvestUtxoConfirmationItem investUtxoConfirmationItem6 = (InvestUtxoConfirmationItem) next2;
                                int iGEmmrt3 = investUtxoConfirmationItem6.gEmmrt();
                                Integer numOLrzqt3 = utxoConfirmationResponseItem3.OLrzqt();
                                if (numOLrzqt3 != null && iGEmmrt3 == numOLrzqt3.intValue() && Intrinsics.EZpvd((Object) investUtxoConfirmationItem6.copydefault(), (Object) utxoConfirmationResponseItem3.AEQbTJ())) {
                                    break;
                                }
                            }
                            InvestUtxoConfirmationItem investUtxoConfirmationItem7 = (InvestUtxoConfirmationItem) next2;
                            utxoConfirmationResponseItem3.EZpvd(investUtxoConfirmationItem7 != null ? investUtxoConfirmationItem7.KWHzl() : null);
                            arrayList4.add(utxoConfirmationResponseItem3);
                        }
                        bundle.putParcelableArrayList("useUtxoList", arrayList4);
                        List<UtxoConfirmationResponseItem> listKWHzl3 = utxoConfirmationResponse.KWHzl();
                        if (listKWHzl3 == null) {
                            listKWHzl3 = yDY.AhwBna();
                        }
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        for (UtxoConfirmationResponseItem utxoConfirmationResponseItem4 : listKWHzl3) {
                            Iterator<T> it4 = list.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it4.next();
                                InvestUtxoConfirmationItem investUtxoConfirmationItem8 = (InvestUtxoConfirmationItem) next;
                                int iGEmmrt4 = investUtxoConfirmationItem8.gEmmrt();
                                Integer numOLrzqt4 = utxoConfirmationResponseItem4.OLrzqt();
                                if (numOLrzqt4 != null && iGEmmrt4 == numOLrzqt4.intValue() && Intrinsics.EZpvd((Object) investUtxoConfirmationItem8.copydefault(), (Object) utxoConfirmationResponseItem4.AEQbTJ())) {
                                    break;
                                }
                            }
                            InvestUtxoConfirmationItem investUtxoConfirmationItem9 = (InvestUtxoConfirmationItem) next;
                            utxoConfirmationResponseItem4.EZpvd(investUtxoConfirmationItem9 != null ? investUtxoConfirmationItem9.KWHzl() : null);
                            arrayList5.add(utxoConfirmationResponseItem4);
                        }
                        bundle.putParcelableArrayList("gasUtxoList", arrayList5);
                        bundle.putSerializable("utxo.confirmation.context", utxoConfirmationContext4);
                        Unit unit2 = Unit.INSTANCE;
                        c10274blP.copydefault(actionBar.copydefault(bundle));
                        FragmentManager supportFragmentManager = fragmentActivity2.getSupportFragmentManager();
                        str = "";
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, str);
                        c10274blP.show(supportFragmentManager, c10274blP.getTag());
                    }
                }
                abstractC43419rot2 = abstractC43419rot;
            } else {
                context2 = context;
                str = "";
            }
            if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot2).KWHzl();
                C10350bmm c10350bmm = C10350bmm.AEQbTJ;
                String localizedMessage = oKServerException.getLocalizedMessage();
                if (localizedMessage.length() == 0) {
                    localizedMessage = context2.getString(C13754dXa.FragmentManager.QVsKAR);
                }
                Intrinsics.checkNotNullExpressionValue(localizedMessage, str);
                c10350bmm.AEQbTJ(new AbstractC10347bmj.Activity(localizedMessage));
            }
            Result.m7377constructorimpl(abstractC43419rot2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
