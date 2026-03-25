package com.okinc.im.imui.conversationlist.viewmodel;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.C32989mnw;
import o.C35830oFg;
import o.C35831oFh;
import o.C44124sEe;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC33835nHp;
import o.nGA;
import o.nGE;
import o.sDZ;
import o.sGF;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class RestrictedConversationListViewModel extends BaseConversationListViewModel {
    public final MutableLiveData<C32989mnw<Set<Integer>>> AuCTel;
    public final C35831oFh AubY;
    public final MutableLiveData<List<Object>> DbNXlk;
    public final MutableLiveData<C32989mnw<BaseConversationListViewModel.NewChatCheckState>> ejfBZ;
    public final MutableLiveData<Boolean> fARcdN;
    public final MutableLiveData<Boolean> fIwbmz;
    public final MutableLiveData<Boolean> fJNWhG;
    public final MutableLiveData<C32989mnw<BaseConversationListViewModel.AddContactCheckState>> fetchVPNInfo;
    public final InterfaceC33835nHp getFieldNames;
    public final MutableLiveData<C32989mnw<BaseConversationListViewModel.SyncSuggestedListCheckState>> getNewProxyInstance;
    public final sGF hDKMBd;
    public final C35830oFg iwGUEr;
    public final BaseConversationListViewModel.ConversationListType uzCIH;
    public final MutableLiveData<C32989mnw<nGA>> values;
    public final int zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public C35831oFh AuCTel() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<nGA>> AuCTelauCTel() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<BaseConversationListViewModel.AddContactCheckState>> AubY() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<Boolean> AwvSrB() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<List<Object>> AxsJAY() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<BaseConversationListViewModel.NewChatCheckState>> OcIXYQ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<BaseConversationListViewModel.SyncSuggestedListCheckState>> QKVWgx() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<Boolean> QOLQEE() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public C35830oFg fJNWhG() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int fZBcTu() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public sGF fetchVPNInfo() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<C32989mnw<Set<Integer>>> gHZMYf() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public BaseConversationListViewModel.ConversationListType isConnected() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public InterfaceC33835nHp values() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public MutableLiveData<Boolean> zuBGHE() {
        return this.fJNWhG;
    }

    @yCM
    public RestrictedConversationListViewModel(@NotNull sGF sgf, @NotNull InterfaceC33835nHp interfaceC33835nHp, @NotNull C35830oFg c35830oFg, @NotNull C35831oFh c35831oFh) {
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(interfaceC33835nHp, "");
        Intrinsics.checkNotNullParameter(c35830oFg, "");
        Intrinsics.checkNotNullParameter(c35831oFh, "");
        this.hDKMBd = sgf;
        this.getFieldNames = interfaceC33835nHp;
        this.iwGUEr = c35830oFg;
        this.AubY = c35831oFh;
        this.uzCIH = BaseConversationListViewModel.ConversationListType.Restricted;
        Boolean bool = Boolean.FALSE;
        this.fIwbmz = new MutableLiveData<>(bool);
        this.ejfBZ = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.getNewProxyInstance = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>(yDY.AhwBna());
        this.AuCTel = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>(bool);
        this.fJNWhG = new MutableLiveData<>(Boolean.TRUE);
        this.zsXlph = 200;
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void AEQbTJ(@NotNull String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str);
        OLrzqt(z);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void dNCPSb() {
        RJOkX();
        copydefault();
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void copydefault() {
        Object objM7377constructorimpl;
        if (!values().KWHzl()) {
            C44124sEe.imLogConversation$default("[In-House] Conversation list flow - web socket not connecting, try connect web socket", null, 2, null);
            finit();
            return;
        }
        C44124sEe.imLogConversation$default("[In-House] Conversation list flow - web socket connected, sync conversation", null, 2, null);
        try {
            Result.Application application = Result.Companion;
            sDZ.AEQbTJ.fARcdN().DbNXlk();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7376boximpl(objM7377constructorimpl);
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void RJOkX() {
        List<Object> value = AxsJAY().getValue();
        int size = ((value != null ? value.size() : 0) / fZBcTu()) + 1;
        int iFZBcTu = fZBcTu();
        if (AkhnZx() == size) {
            C44124sEe.imLogConversation$default("observeConversationListFlow - getConversationsByPageFlow this page is already fetched...", null, 2, null);
        } else {
            if (sSMYrx()) {
                C44124sEe.imLogConversation$default("observeConversationListFlow - getConversationsByPageFlow is already loading...", null, 2, null);
                return;
            }
            KWHzl(true);
            KWHzl(size);
            copydefault(iFZBcTu * size, size == 1, size);
        }
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public void EZpvd(@NotNull List<? extends nGE> list, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        AwvSrB().setValue(Boolean.valueOf((num != null ? num.intValue() : list.size()) >= fZBcTu() * AkhnZx()));
        AuCTelauCTel().setValue(new C32989mnw<>(nGA.ActionBar.AEQbTJ));
        AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Fragment(false)));
        AxsJAY().setValue(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OLrzqt(@NotNull List<OKConversation> list, int i, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        RestrictedConversationListViewModel$handleGetConversationListSuccess$1 restrictedConversationListViewModel$handleGetConversationListSuccess$1;
        RestrictedConversationListViewModel restrictedConversationListViewModel;
        if (continuation instanceof RestrictedConversationListViewModel$handleGetConversationListSuccess$1) {
            restrictedConversationListViewModel$handleGetConversationListSuccess$1 = (RestrictedConversationListViewModel$handleGetConversationListSuccess$1) continuation;
            int i2 = restrictedConversationListViewModel$handleGetConversationListSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                restrictedConversationListViewModel$handleGetConversationListSuccess$1.label = i2 - Integer.MIN_VALUE;
            } else {
                restrictedConversationListViewModel$handleGetConversationListSuccess$1 = new RestrictedConversationListViewModel$handleGetConversationListSuccess$1(this, continuation);
            }
        }
        Object objWithContext = restrictedConversationListViewModel$handleGetConversationListSuccess$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = restrictedConversationListViewModel$handleGetConversationListSuccess$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            RestrictedConversationListViewModel$handleGetConversationListSuccess$result$1 restrictedConversationListViewModel$handleGetConversationListSuccess$result$1 = new RestrictedConversationListViewModel$handleGetConversationListSuccess$result$1(this, list, null);
            restrictedConversationListViewModel$handleGetConversationListSuccess$1.L$0 = this;
            restrictedConversationListViewModel$handleGetConversationListSuccess$1.L$1 = list;
            restrictedConversationListViewModel$handleGetConversationListSuccess$1.I$0 = i;
            restrictedConversationListViewModel$handleGetConversationListSuccess$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, restrictedConversationListViewModel$handleGetConversationListSuccess$result$1, restrictedConversationListViewModel$handleGetConversationListSuccess$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            restrictedConversationListViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = restrictedConversationListViewModel$handleGetConversationListSuccess$1.I$0;
            list = (List) restrictedConversationListViewModel$handleGetConversationListSuccess$1.L$1;
            restrictedConversationListViewModel = (RestrictedConversationListViewModel) restrictedConversationListViewModel$handleGetConversationListSuccess$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        ArrayList arrayList = (ArrayList) objWithContext;
        int size = list.size();
        restrictedConversationListViewModel.AEQbTJ(arrayList.size(), i);
        restrictedConversationListViewModel.EZpvd(arrayList, C56443yFo.AEQbTJ(size));
        return Unit.INSTANCE;
    }

    @Override // com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel
    public Object OLrzqt(Throwable th, String str, @NotNull Continuation<? super Unit> continuation) {
        AuCTelauCTel().setValue(new C32989mnw<>(nGA.ActionBar.AEQbTJ));
        AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Fragment(false)));
        String message = th != null ? th.getMessage() : null;
        if (message != null && (!StringsKt__StringsKt.fARcdN((CharSequence) message))) {
            C55326xho.toast$default(message, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        AuCTelauCTel().setValue(new C32989mnw<>(nGA.FragmentManager.copydefault));
        KWHzl(th);
        if (str != null) {
            C44124sEe.imLogConversation$default(str, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
