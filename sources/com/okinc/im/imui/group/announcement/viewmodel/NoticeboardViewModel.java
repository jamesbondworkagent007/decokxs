package com.okinc.im.imui.group.announcement.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.bean.IMRelationInfo;
import com.okinc.im.bean.RelationModel;
import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC34085nQw;
import o.AbstractC34088nQz;
import o.C35791oDv;
import o.C35793oDx;
import o.C35794oDy;
import o.C35860oGj;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.yCM;
import o.yEE;
import o.yEJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class NoticeboardViewModel extends ViewModel {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final MutableSharedFlow<AbstractC34088nQz> AEQbTJ;
    public final C35860oGj AYXKKw;
    public final GroupInfo AhwBna;
    public final Map<String, String> AkhnZx;
    public final MutableStateFlow<AbstractC34085nQw> KWHzl;
    public final C35794oDy OLrzqt;
    public final C35791oDv copydefault;
    public final boolean djBIcL;
    public final SavedStateHandle fetchVPNInfo;
    public final C35793oDx gEmmrt;
    public final SharedFlow<AbstractC34088nQz> isConnected;
    public final long valueOf;
    public final StateFlow<AbstractC34085nQw> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC34085nQw> AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC34088nQz> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInfo djBIcL() {
        return this.AhwBna;
    }

    @yCM
    public NoticeboardViewModel(@NotNull C35793oDx c35793oDx, @NotNull C35791oDv c35791oDv, @NotNull C35794oDy c35794oDy, @NotNull C35860oGj c35860oGj, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c35793oDx, "");
        Intrinsics.checkNotNullParameter(c35791oDv, "");
        Intrinsics.checkNotNullParameter(c35794oDy, "");
        Intrinsics.checkNotNullParameter(c35860oGj, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.gEmmrt = c35793oDx;
        this.copydefault = c35791oDv;
        this.OLrzqt = c35794oDy;
        this.AYXKKw = c35860oGj;
        this.fetchVPNInfo = savedStateHandle;
        this.AhwBna = (GroupInfo) savedStateHandle.get("info");
        Long l = (Long) savedStateHandle.get("id");
        this.valueOf = l != null ? l.longValue() : -1L;
        Boolean bool = (Boolean) savedStateHandle.get(BotWebHook.KEY_ACTION);
        this.djBIcL = bool != null ? bool.booleanValue() : false;
        MutableStateFlow<AbstractC34085nQw> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC34085nQw.StateListAnimator.EZpvd);
        this.KWHzl = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<AbstractC34088nQz> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AkhnZx = new LinkedHashMap();
        isConnected();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.announcement.viewmodel.NoticeboardViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final boolean gEmmrt() {
        Boolean bool = (Boolean) this.fetchVPNInfo.get("banner_click_handled");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void KWHzl(boolean z) {
        this.fetchVPNInfo.set("banner_click_handled", Boolean.valueOf(z));
    }

    public final boolean values() {
        Boolean bool = (Boolean) this.fetchVPNInfo.get("selection_mode");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void EZpvd(boolean z) {
        this.fetchVPNInfo.set("selection_mode", Boolean.valueOf(z));
    }

    public final Set<Long> valueOf() {
        Set<Long> setOqFWZa;
        List list = (List) this.fetchVPNInfo.get("selected_ids");
        return (list == null || (setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(list)) == null) ? yEE.copydefault() : setOqFWZa;
    }

    public final void copydefault(Set<Long> set) {
        this.fetchVPNInfo.set("selected_ids", CollectionsKt___CollectionsKt.AxsJAYsNCnLh(set));
    }

    public final void isConnected() {
        GroupInfo groupInfo = this.AhwBna;
        if (groupInfo != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NoticeboardViewModel$loadAnnouncements$1(this, groupInfo, null), 3, null);
        } else {
            this.KWHzl.setValue(new AbstractC34085nQw.TaskDescription(new IllegalStateException("GroupInfo is required"), "Group information is missing"));
        }
    }

    public final Object EZpvd(List<GroupAnnouncementInfo> list, Continuation<? super Unit> continuation) {
        Object next;
        Object objEmit;
        if (!this.djBIcL || gEmmrt()) {
            return Unit.INSTANCE;
        }
        KWHzl(true);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((GroupAnnouncementInfo) next).getAnnounceId() == this.valueOf) {
                break;
            }
        }
        GroupAnnouncementInfo groupAnnouncementInfo = (GroupAnnouncementInfo) next;
        return (groupAnnouncementInfo == null || (objEmit = this.AEQbTJ.emit(new AbstractC34088nQz.PendingIntent(groupAnnouncementInfo), continuation)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objEmit;
    }

    public final void AkhnZx() {
        isConnected();
        KWHzl(AbstractC34088nQz.Fragment.AEQbTJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() {
        AbstractC34088nQz stateListAnimator;
        GroupInfo groupInfo = this.AhwBna;
        if (groupInfo == null) {
            return;
        }
        AbstractC34085nQw value = this.KWHzl.getValue();
        if (value instanceof AbstractC34085nQw.Application) {
            AbstractC34085nQw.Application application = (AbstractC34085nQw.Application) value;
            if (application.AEQbTJ().size() >= application.copydefault()) {
                stateListAnimator = new AbstractC34088nQz.PictureInPictureParams(application.copydefault());
            } else {
                stateListAnimator = new AbstractC34088nQz.StateListAnimator(groupInfo.getGroupId());
            }
        }
        KWHzl(stateListAnimator);
    }

    public final boolean AEQbTJ() {
        GroupInfo groupInfo = this.AhwBna;
        return groupInfo != null && groupInfo.isAllowPostAnnouncement();
    }

    public final void OLrzqt(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
        Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
        KWHzl(new AbstractC34088nQz.PendingIntent(groupAnnouncementInfo));
    }

    public final void AEQbTJ(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
        Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
        KWHzl(new AbstractC34088nQz.FragmentManager(groupAnnouncementInfo));
    }

    public final void AEQbTJ(@NotNull String str, long j, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NoticeboardViewModel$editNotice$1(this, str, j, str2, z, null), 3, null);
    }

    public final void EZpvd(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
        Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
        KWHzl(new AbstractC34088nQz.Dialog(groupAnnouncementInfo));
    }

    public final void KWHzl(@NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
        Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NoticeboardViewModel$removeAnnouncement$1(this, groupAnnouncementInfo, C56402yEa.EZpvd(Long.valueOf(groupAnnouncementInfo.getAnnounceId())), null), 3, null);
    }

    public final void OLrzqt() {
        EZpvd(true);
        copydefault(yEE.copydefault());
        DbNXlk();
        KWHzl(AbstractC34088nQz.Activity.EZpvd);
    }

    public final void KWHzl() {
        EZpvd(false);
        copydefault(yEE.copydefault());
        DbNXlk();
        KWHzl(AbstractC34088nQz.Application.copydefault);
    }

    public final void EZpvd(long j) {
        Set<Long> setOLrzqt;
        if (valueOf().contains(Long.valueOf(j))) {
            setOLrzqt = yEJ.EZpvd((Set<? extends Long>) ((Set<? extends Object>) valueOf()), Long.valueOf(j));
        } else {
            setOLrzqt = yEJ.OLrzqt(valueOf(), Long.valueOf(j));
        }
        copydefault(setOLrzqt);
        DbNXlk();
    }

    public final void fetchVPNInfo() {
        if (valueOf().isEmpty()) {
            KWHzl(new AbstractC34088nQz.AssistContent("Please select items first"));
        } else {
            KWHzl(new AbstractC34088nQz.LoaderManager(valueOf().size()));
        }
    }

    public final void EZpvd() {
        String groupId;
        List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(valueOf());
        GroupInfo groupInfo = this.AhwBna;
        if (groupInfo == null || (groupId = groupInfo.getGroupId()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NoticeboardViewModel$confirmRemoveSelectedAnnouncements$1(this, groupId, listAxsJAYsNCnLh, null), 3, null);
    }

    public final String AEQbTJ(String str) {
        if (str != null) {
            return this.AkhnZx.get(str);
        }
        return null;
    }

    public final void DbNXlk() {
        AbstractC34085nQw value = this.KWHzl.getValue();
        if (value instanceof AbstractC34085nQw.Application) {
            this.KWHzl.setValue(AbstractC34085nQw.Application.copy$default((AbstractC34085nQw.Application) value, null, 0, false, values(), valueOf(), 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(List<GroupAnnouncementInfo> list, Continuation<? super Unit> continuation) throws Throwable {
        NoticeboardViewModel$fetchUserNamesForAnnouncements$1 noticeboardViewModel$fetchUserNamesForAnnouncements$1;
        NoticeboardViewModel noticeboardViewModel;
        if (continuation instanceof NoticeboardViewModel$fetchUserNamesForAnnouncements$1) {
            noticeboardViewModel$fetchUserNamesForAnnouncements$1 = (NoticeboardViewModel$fetchUserNamesForAnnouncements$1) continuation;
            int i = noticeboardViewModel$fetchUserNamesForAnnouncements$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                noticeboardViewModel$fetchUserNamesForAnnouncements$1.label = i - Integer.MIN_VALUE;
            } else {
                noticeboardViewModel$fetchUserNamesForAnnouncements$1 = new NoticeboardViewModel$fetchUserNamesForAnnouncements$1(this, continuation);
            }
        }
        Object objKWHzl = noticeboardViewModel$fetchUserNamesForAnnouncements$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = noticeboardViewModel$fetchUserNamesForAnnouncements$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String updateBy = ((GroupAnnouncementInfo) it.next()).getUpdateBy();
                    if (updateBy != null) {
                        arrayList.add(updateBy);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList2);
                if (listQbewEr.isEmpty()) {
                    return Unit.INSTANCE;
                }
                Result.Application application = Result.Companion;
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listQbewEr, 10));
                Iterator it2 = listQbewEr.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new RelationModel((String) it2.next(), (String) null, 2, (DefaultConstructorMarker) null));
                }
                C35860oGj c35860oGj = this.AYXKKw;
                CacheStrategy cacheStrategy = CacheStrategy.CacheOnly;
                noticeboardViewModel$fetchUserNamesForAnnouncements$1.L$0 = this;
                noticeboardViewModel$fetchUserNamesForAnnouncements$1.label = 1;
                objKWHzl = c35860oGj.KWHzl(arrayList3, cacheStrategy, noticeboardViewModel$fetchUserNamesForAnnouncements$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                noticeboardViewModel = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                noticeboardViewModel = (NoticeboardViewModel) noticeboardViewModel$fetchUserNamesForAnnouncements$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            for (IMRelationInfo iMRelationInfo : (List) objKWHzl) {
                noticeboardViewModel.AkhnZx.put(iMRelationInfo.getUserUid(), iMRelationInfo.getDisplayName());
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(AbstractC34088nQz abstractC34088nQz) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NoticeboardViewModel$emitEvent$1(this, abstractC34088nQz, null), 3, null);
    }
}
