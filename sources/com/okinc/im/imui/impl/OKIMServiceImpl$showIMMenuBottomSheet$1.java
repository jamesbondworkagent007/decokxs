package com.okinc.im.imui.impl;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.im.imui.conversationlist.menu.home.HomeAddContactMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeChatSettingsMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeMarkAllAsReadMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeMyQRScannerMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeNewChatMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.NewOrbitPostPerformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33810nGr;
import o.C43251rlk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC35698oAj;
import o.InterfaceC37981pHw;
import o.oDZ;
import o.pUU;
import o.rTU;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMServiceImpl$showIMMenuBottomSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $hostActivity;
    final /* synthetic */ List<InterfaceC35698oAj> $menuList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.oAj> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKIMServiceImpl$showIMMenuBottomSheet$1(FragmentActivity fragmentActivity, List<? extends InterfaceC35698oAj> list, Continuation<? super OKIMServiceImpl$showIMMenuBottomSheet$1> continuation) {
        super(2, continuation);
        this.$hostActivity = fragmentActivity;
        this.$menuList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKIMServiceImpl$showIMMenuBottomSheet$1 oKIMServiceImpl$showIMMenuBottomSheet$1 = new OKIMServiceImpl$showIMMenuBottomSheet$1(this.$hostActivity, this.$menuList, continuation);
        oKIMServiceImpl$showIMMenuBottomSheet$1.L$0 = obj;
        return oKIMServiceImpl$showIMMenuBottomSheet$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMServiceImpl$showIMMenuBottomSheet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Parcelable homeMarkAllAsReadMenuItemPerformer;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                oDZ odz = new oDZ((InterfaceC37981pHw) C43251rlk.copydefault(InterfaceC37981pHw.class));
                Result.Application application = Result.Companion;
                this.label = 1;
                obj = odz.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = boolKWHzl;
        }
        boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
        pUU.KWHzl("OKIMServiceImpl", "kycCheck: " + zBooleanValue);
        if (!zBooleanValue) {
            rTU.Application.checkAndRestrictsDistributary$default((rTU) C43251rlk.copydefault(rTU.class), this.$hostActivity, null, null, null, null, null, 62, null);
        } else {
            List<InterfaceC35698oAj> list = this.$menuList;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (InterfaceC35698oAj interfaceC35698oAj : list) {
                if (interfaceC35698oAj instanceof InterfaceC35698oAj.Fragment) {
                    homeMarkAllAsReadMenuItemPerformer = new HomeMyQRScannerMenuItemPerformer(((InterfaceC35698oAj.Fragment) interfaceC35698oAj).copydefault());
                } else if (interfaceC35698oAj instanceof InterfaceC35698oAj.TaskDescription) {
                    homeMarkAllAsReadMenuItemPerformer = new HomeAddContactMenuItemPerformer(((InterfaceC35698oAj.TaskDescription) interfaceC35698oAj).KWHzl());
                } else if (interfaceC35698oAj instanceof InterfaceC35698oAj.StateListAnimator) {
                    homeMarkAllAsReadMenuItemPerformer = new HomeNewChatMenuItemPerformer(((InterfaceC35698oAj.StateListAnimator) interfaceC35698oAj).copydefault());
                } else if (interfaceC35698oAj instanceof InterfaceC35698oAj.ActionBar) {
                    homeMarkAllAsReadMenuItemPerformer = new NewOrbitPostPerformer();
                } else if (interfaceC35698oAj instanceof InterfaceC35698oAj.Activity) {
                    homeMarkAllAsReadMenuItemPerformer = new HomeChatSettingsMenuItemPerformer();
                } else {
                    if (!(interfaceC35698oAj instanceof InterfaceC35698oAj.Application)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    homeMarkAllAsReadMenuItemPerformer = new HomeMarkAllAsReadMenuItemPerformer();
                }
                arrayList.add(homeMarkAllAsReadMenuItemPerformer);
            }
            C33810nGr c33810nGrEZpvd = C33810nGr.Companion.EZpvd(arrayList);
            FragmentManager supportFragmentManager = this.$hostActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c33810nGrEZpvd.show(supportFragmentManager);
        }
        return Unit.INSTANCE;
    }
}
