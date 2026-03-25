package com.okinc.im.imui.messageV2.view.keyboard.plugin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC35291nsZ;
import o.C32989mnw;
import o.C35854oGd;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35289nsX;
import o.oDO;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PluginsViewModel extends ViewModel {
    public final MutableLiveData<C32989mnw<List<GeneralAction>>> AEQbTJ;
    public final LiveData<List<AbstractC35291nsZ>> AhwBna;
    public final InterfaceC35289nsX EZpvd;
    public final oDO KWHzl;
    public final MutableLiveData<List<AbstractC35291nsZ>> OLrzqt;
    public final LiveData<C32989mnw<List<GeneralAction>>> copydefault;
    public final C35854oGd gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<GeneralAction>>> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC35289nsX KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<AbstractC35291nsZ>> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public PluginsViewModel(@NotNull C35854oGd c35854oGd, @NotNull oDO odo) {
        Intrinsics.checkNotNullParameter(c35854oGd, "");
        Intrinsics.checkNotNullParameter(odo, "");
        this.gEmmrt = c35854oGd;
        this.KWHzl = odo;
        MutableLiveData<C32989mnw<List<GeneralAction>>> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        this.copydefault = mutableLiveData;
        MutableLiveData<List<AbstractC35291nsZ>> mutableLiveData2 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData2;
        this.AhwBna = mutableLiveData2;
        this.EZpvd = new TaskDescription();
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription implements InterfaceC35289nsX {
        public TaskDescription() {
        }

        @Override // o.InterfaceC35289nsX
        public void KWHzl(GeneralAction generalAction) {
            Intrinsics.checkNotNullParameter(generalAction, "");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(PluginsViewModel.this), null, null, new PluginsViewModel$executeGeneralActionServiceProvider$1$execute$1(PluginsViewModel.this, generalAction, null), 3, null);
        }

        @Override // o.InterfaceC35289nsX
        public void AEQbTJ(List<? extends GeneralAction> list) {
            Intrinsics.checkNotNullParameter(list, "");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(PluginsViewModel.this), null, null, new PluginsViewModel$executeGeneralActionServiceProvider$1$execute$2(PluginsViewModel.this, list, null), 3, null);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.OLrzqt.setValue(null);
    }

    public final void copydefault(String str, IMPageType iMPageType) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PluginsViewModel$init$1(this, str, iMPageType, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull String str, @NotNull Continuation<? super List<GroupMemberInfo>> continuation) throws Throwable {
        PluginsViewModel$getOtherGroupMembers$1 pluginsViewModel$getOtherGroupMembers$1;
        if (continuation instanceof PluginsViewModel$getOtherGroupMembers$1) {
            pluginsViewModel$getOtherGroupMembers$1 = (PluginsViewModel$getOtherGroupMembers$1) continuation;
            int i = pluginsViewModel$getOtherGroupMembers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pluginsViewModel$getOtherGroupMembers$1.label = i - Integer.MIN_VALUE;
            } else {
                pluginsViewModel$getOtherGroupMembers$1 = new PluginsViewModel$getOtherGroupMembers$1(this, continuation);
            }
        }
        Object objEZpvd = pluginsViewModel$getOtherGroupMembers$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = pluginsViewModel$getOtherGroupMembers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            oDO odo = this.KWHzl;
            pluginsViewModel$getOtherGroupMembers$1.label = 1;
            objEZpvd = odo.EZpvd(str, pluginsViewModel$getOtherGroupMembers$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objEZpvd) {
            if (!Intrinsics.EZpvd((Object) ((GroupMemberInfo) obj).getMemberId(), (Object) C44157sFk.EZpvd())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
