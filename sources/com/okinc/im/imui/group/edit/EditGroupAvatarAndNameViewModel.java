package com.okinc.im.imui.group.edit;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C35784oDo;
import o.C37721ozF;
import o.C56391yDq;
import o.C56442yFn;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class EditGroupAvatarAndNameViewModel extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final SharedFlow<Activity> AEQbTJ;
    public final StateFlow<Application> AYXKKw;
    public final SavedStateHandle AhwBna;
    public final MutableStateFlow<Application> EZpvd;
    public final MutableSharedFlow<Activity> OLrzqt;
    public final GroupInfo copydefault;
    public final C35784oDo gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> copydefault() {
        return this.AYXKKw;
    }

    @yCM
    public EditGroupAvatarAndNameViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C35784oDo c35784oDo) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c35784oDo, "");
        this.AhwBna = savedStateHandle;
        this.gEmmrt = c35784oDo;
        GroupInfo groupInfo = (GroupInfo) savedStateHandle.get("info");
        this.copydefault = groupInfo;
        String name = groupInfo != null ? groupInfo.getName() : null;
        String str = name == null ? "" : name;
        String name2 = groupInfo != null ? groupInfo.getName() : null;
        String str2 = name2 == null ? "" : name2;
        String bizGroupName = groupInfo != null ? groupInfo.getBizGroupName() : null;
        String str3 = bizGroupName == null ? "" : bizGroupName;
        String bizGroupName2 = groupInfo != null ? groupInfo.getBizGroupName() : null;
        String str4 = bizGroupName2 == null ? "" : bizGroupName2;
        boolean z = groupInfo != null && groupInfo.getCanUpdateBizGroupName();
        String description = groupInfo != null ? groupInfo.getDescription() : null;
        String str5 = description == null ? "" : description;
        String description2 = groupInfo != null ? groupInfo.getDescription() : null;
        String str6 = description2 == null ? "" : description2;
        String avatar = groupInfo != null ? groupInfo.getAvatar() : null;
        MutableStateFlow<Application> MutableStateFlow = StateFlowKt.MutableStateFlow(new Application(false, str, str2, str3, str4, z, str5, str6, avatar == null ? "" : avatar, null, false, null, null, 7681, null));
        this.EZpvd = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Activity> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.OLrzqt = mutableSharedFlowAEQbTJ;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EditGroupAvatarAndNameViewModel$onAvatarPickerClicked$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        String groupId;
        Application value = this.EZpvd.getValue();
        GroupInfo groupInfo = this.copydefault;
        if (groupInfo == null || (groupId = groupInfo.getGroupId()) == null) {
            return;
        }
        if (copydefault(value)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EditGroupAvatarAndNameViewModel$onSaveClicked$1(this, null), 3, null);
        } else if (value.DbNXlk()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EditGroupAvatarAndNameViewModel$onSaveClicked$2(this, groupId, value, null), 3, null);
        }
    }

    public final boolean copydefault(Application application) {
        GroupInfo groupInfo = this.copydefault;
        boolean z = (groupInfo != null ? groupInfo.getPublicGroupType() : null) == GroupPublicType.PUBLIC;
        String string = StringsKt__StringsKt.hDKMBd((CharSequence) application.KWHzl()).toString();
        return z && string.codePointCount(0, string.length()) < 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, Application application, Continuation<? super SavedChangeType> continuation) throws Throwable {
        EditGroupAvatarAndNameViewModel$saveGroupChanges$1 editGroupAvatarAndNameViewModel$saveGroupChanges$1;
        String str2;
        String str3;
        String str4;
        Uri uri;
        if (continuation instanceof EditGroupAvatarAndNameViewModel$saveGroupChanges$1) {
            editGroupAvatarAndNameViewModel$saveGroupChanges$1 = (EditGroupAvatarAndNameViewModel$saveGroupChanges$1) continuation;
            int i = editGroupAvatarAndNameViewModel$saveGroupChanges$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                editGroupAvatarAndNameViewModel$saveGroupChanges$1.label = i - Integer.MIN_VALUE;
            } else {
                editGroupAvatarAndNameViewModel$saveGroupChanges$1 = new EditGroupAvatarAndNameViewModel$saveGroupChanges$1(this, continuation);
            }
        }
        Object obj = editGroupAvatarAndNameViewModel$saveGroupChanges$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = editGroupAvatarAndNameViewModel$saveGroupChanges$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String string = StringsKt__StringsKt.hDKMBd((CharSequence) application.copydefault()).toString();
            if (string.length() <= 0 || Intrinsics.EZpvd((Object) string, (Object) StringsKt__StringsKt.hDKMBd((CharSequence) application.valueOf()).toString())) {
                string = null;
            }
            String string2 = StringsKt__StringsKt.hDKMBd((CharSequence) application.EZpvd()).toString();
            if (!application.AEQbTJ() || Intrinsics.EZpvd((Object) string2, (Object) StringsKt__StringsKt.hDKMBd((CharSequence) application.AYXKKw()).toString())) {
                string2 = null;
            }
            String string3 = StringsKt__StringsKt.hDKMBd((CharSequence) application.KWHzl()).toString();
            String str5 = Intrinsics.EZpvd((Object) string3, (Object) StringsKt__StringsKt.hDKMBd((CharSequence) application.djBIcL()).toString()) ^ true ? string3 : null;
            Uri uriAhwBna = application.AhwBna();
            C35784oDo c35784oDo = this.gEmmrt;
            C35784oDo.ActionBar actionBar = new C35784oDo.ActionBar(str, string, string2, str5, uriAhwBna);
            editGroupAvatarAndNameViewModel$saveGroupChanges$1.L$0 = string;
            editGroupAvatarAndNameViewModel$saveGroupChanges$1.L$1 = string2;
            editGroupAvatarAndNameViewModel$saveGroupChanges$1.L$2 = str5;
            editGroupAvatarAndNameViewModel$saveGroupChanges$1.L$3 = uriAhwBna;
            editGroupAvatarAndNameViewModel$saveGroupChanges$1.label = 1;
            if (c35784oDo.KWHzl(actionBar, editGroupAvatarAndNameViewModel$saveGroupChanges$1) == objCopydefault) {
                return objCopydefault;
            }
            str2 = string;
            str3 = string2;
            str4 = str5;
            uri = uriAhwBna;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = (Uri) editGroupAvatarAndNameViewModel$saveGroupChanges$1.L$3;
            str4 = (String) editGroupAvatarAndNameViewModel$saveGroupChanges$1.L$2;
            str3 = (String) editGroupAvatarAndNameViewModel$saveGroupChanges$1.L$1;
            str2 = (String) editGroupAvatarAndNameViewModel$saveGroupChanges$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (str4 != null || uri != null) {
            return SavedChangeType.OTHER;
        }
        if (str3 != null && str2 != null) {
            return SavedChangeType.BOTH_NAMES;
        }
        if (str3 != null) {
            return SavedChangeType.ADMIN_NAME_ONLY;
        }
        if (str2 != null) {
            return SavedChangeType.CUSTOMER_NAME_ONLY;
        }
        return SavedChangeType.OTHER;
    }

    public static final class Application {
        public final String AEQbTJ;
        public final boolean AYXKKw;
        public final String AhwBna;
        public final Uri DbNXlk;
        public final String EZpvd;
        public final String KWHzl;
        public final boolean OLrzqt;
        public final String copydefault;
        public final String djBIcL;
        public final String fetchVPNInfo;
        public final String gEmmrt;
        public final String isConnected;
        public final boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(false, null, null, null, null, false, null, null, null, null, false, null, null, 8191, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, String str, String str2, String str3, String str4, boolean z2, String str5, String str6, String str7, Uri uri, boolean z3, String str8, String str9, int i, Object obj) {
            return application.OLrzqt((i & 1) != 0 ? application.valueOf : z, (i & 2) != 0 ? application.AhwBna : str, (i & 4) != 0 ? application.fetchVPNInfo : str2, (i & 8) != 0 ? application.KWHzl : str3, (i & 16) != 0 ? application.djBIcL : str4, (i & 32) != 0 ? application.OLrzqt : z2, (i & 64) != 0 ? application.AEQbTJ : str5, (i & 128) != 0 ? application.gEmmrt : str6, (i & 256) != 0 ? application.copydefault : str7, (i & 512) != 0 ? application.DbNXlk : uri, (i & 1024) != 0 ? application.AYXKKw : z3, (i & 2048) != 0 ? application.isConnected : str8, (i & 4096) != 0 ? application.EZpvd : str9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Uri AhwBna() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean DbNXlk() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z2, @NotNull String str5, @NotNull String str6, @NotNull String str7, Uri uri, boolean z3, String str8, String str9) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new Application(z, str, str2, str3, str4, z2, str5, str6, str7, uri, z3, str8, str9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.valueOf == application.valueOf && Intrinsics.EZpvd((Object) this.AhwBna, (Object) application.AhwBna) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) application.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) application.KWHzl) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) application.djBIcL) && this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) application.gEmmrt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && Intrinsics.EZpvd(this.DbNXlk, application.DbNXlk) && this.AYXKKw == application.AYXKKw && Intrinsics.EZpvd((Object) this.isConnected, (Object) application.isConnected) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.valueOf);
            int iHashCode2 = this.AhwBna.hashCode();
            int iHashCode3 = this.fetchVPNInfo.hashCode();
            int iHashCode4 = this.KWHzl.hashCode();
            int iHashCode5 = this.djBIcL.hashCode();
            int iHashCode6 = Boolean.hashCode(this.OLrzqt);
            int iHashCode7 = this.AEQbTJ.hashCode();
            int iHashCode8 = this.gEmmrt.hashCode();
            int iHashCode9 = this.copydefault.hashCode();
            Uri uri = this.DbNXlk;
            int iHashCode10 = uri == null ? 0 : uri.hashCode();
            int iHashCode11 = Boolean.hashCode(this.AYXKKw);
            String str = this.isConnected;
            int iHashCode12 = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EditGroupUiState(isLoading=" + this.valueOf + ", groupName=" + this.AhwBna + ", originalGroupName=" + this.fetchVPNInfo + ", bizGroupName=" + this.KWHzl + ", originalBizGroupName=" + this.djBIcL + ", canUpdateBizGroupName=" + this.OLrzqt + ", groupDescription=" + this.AEQbTJ + ", originalGroupDescription=" + this.gEmmrt + ", groupAvatarUrl=" + this.copydefault + ", selectedAvatarUri=" + this.DbNXlk + ", isSaveEnabled=" + this.AYXKKw + ", successMessage=" + this.isConnected + ", errorMessage=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.fetchVPNInfo;
        }

        public Application(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z2, @NotNull String str5, @NotNull String str6, @NotNull String str7, Uri uri, boolean z3, String str8, String str9) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.valueOf = z;
            this.AhwBna = str;
            this.fetchVPNInfo = str2;
            this.KWHzl = str3;
            this.djBIcL = str4;
            this.OLrzqt = z2;
            this.AEQbTJ = str5;
            this.gEmmrt = str6;
            this.copydefault = str7;
            this.DbNXlk = uri;
            this.AYXKKw = z3;
            this.isConnected = str8;
            this.EZpvd = str9;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:android.net.Uri:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null android.net.Uri) : (r24v0 android.net.Uri))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r25v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, boolean, java.lang.String, java.lang.String):void (m)] (LINE:164) call: com.okinc.im.imui.group.edit.EditGroupAvatarAndNameViewModel.Application.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, boolean, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Application(boolean z, String str, String str2, String str3, String str4, boolean z2, String str5, String str6, String str7, Uri uri, boolean z3, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) == 0 ? str7 : "", (i & 512) != 0 ? null : uri, (i & 1024) == 0 ? z3 : false, (i & 2048) != 0 ? null : str8, (i & 4096) == 0 ? str9 : null);
        }

        public final boolean gEmmrt() {
            return (StringsKt__StringsKt.hDKMBd((CharSequence) this.AhwBna).toString().length() > 0 && !Intrinsics.EZpvd((Object) StringsKt__StringsKt.hDKMBd((CharSequence) this.AhwBna).toString(), (Object) StringsKt__StringsKt.hDKMBd((CharSequence) this.fetchVPNInfo).toString())) || (this.OLrzqt && !Intrinsics.EZpvd((Object) StringsKt__StringsKt.hDKMBd((CharSequence) this.KWHzl).toString(), (Object) StringsKt__StringsKt.hDKMBd((CharSequence) this.djBIcL).toString())) || (Intrinsics.EZpvd((Object) StringsKt__StringsKt.hDKMBd((CharSequence) this.AEQbTJ).toString(), (Object) StringsKt__StringsKt.hDKMBd((CharSequence) this.gEmmrt).toString()) ^ true) || (this.DbNXlk != null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class SavedChangeType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SavedChangeType[] $VALUES;
        public static final SavedChangeType ADMIN_NAME_ONLY = new SavedChangeType("ADMIN_NAME_ONLY", 0);
        public static final SavedChangeType CUSTOMER_NAME_ONLY = new SavedChangeType("CUSTOMER_NAME_ONLY", 1);
        public static final SavedChangeType BOTH_NAMES = new SavedChangeType("BOTH_NAMES", 2);
        public static final SavedChangeType OTHER = new SavedChangeType("OTHER", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SavedChangeType[] $values() {
            return new SavedChangeType[]{ADMIN_NAME_ONLY, CUSTOMER_NAME_ONLY, BOTH_NAMES, OTHER};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SavedChangeType> getEntries() {
            return $ENTRIES;
        }

        private SavedChangeType(String str, int i) {
        }

        static {
            SavedChangeType[] savedChangeTypeArr$values = $values();
            $VALUES = savedChangeTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(savedChangeTypeArr$values);
        }

        public static SavedChangeType valueOf(String str) {
            return (SavedChangeType) Enum.valueOf(SavedChangeType.class, str);
        }

        public static SavedChangeType[] values() {
            return (SavedChangeType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.edit.EditGroupAvatarAndNameViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ActionBar extends Activity {
            public final SavedChangeType OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, SavedChangeType savedChangeType, int i, Object obj) {
                if ((i & 1) != 0) {
                    savedChangeType = actionBar.OLrzqt;
                }
                return actionBar.OLrzqt(savedChangeType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar OLrzqt(@NotNull SavedChangeType savedChangeType) {
                Intrinsics.checkNotNullParameter(savedChangeType, "");
                return new ActionBar(savedChangeType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SavedChangeType OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && this.OLrzqt == ((ActionBar) obj).OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SaveSuccess(changeType=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull SavedChangeType savedChangeType) {
                super(null);
                Intrinsics.checkNotNullParameter(savedChangeType, "");
                this.OLrzqt = savedChangeType;
            }
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.edit.EditGroupAvatarAndNameViewModel$Activity$Activity, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes18.dex */
        public static final class C0418Activity extends Activity {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0418Activity copy$default(C0418Activity c0418Activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0418Activity.OLrzqt;
                }
                return c0418Activity.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0418Activity OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0418Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0418Activity) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((C0418Activity) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SaveError(message=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0418Activity(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class TaskDescription extends Activity {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends Activity {
            public static final Application copydefault = new Application();

            private Application() {
                super(null);
            }
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.edit.EditGroupAvatarAndNameViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<Application> mutableStateFlow = this.EZpvd;
        while (true) {
            Application value = mutableStateFlow.getValue();
            Application application = value;
            MutableStateFlow<Application> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, Application.copy$default(application, false, str, null, null, null, false, null, null, null, null, Application.copy$default(application, false, str, null, null, null, false, null, null, null, null, false, null, null, 8189, null).gEmmrt(), null, null, 7165, null))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<Application> mutableStateFlow = this.EZpvd;
        while (true) {
            Application value = mutableStateFlow.getValue();
            Application application = value;
            MutableStateFlow<Application> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, Application.copy$default(application, false, null, null, str, null, false, null, null, null, null, Application.copy$default(application, false, null, null, str, null, false, null, null, null, null, false, null, null, 8183, null).gEmmrt(), null, null, 7159, null))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<Application> mutableStateFlow = this.EZpvd;
        while (true) {
            Application value = mutableStateFlow.getValue();
            Application application = value;
            MutableStateFlow<Application> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, Application.copy$default(application, false, null, null, null, null, false, str, null, null, null, Application.copy$default(application, false, null, null, null, null, false, str, null, null, null, false, null, null, 8127, null).gEmmrt(), null, null, 7103, null))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void OLrzqt(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        MutableStateFlow<Application> mutableStateFlow = this.EZpvd;
        while (true) {
            Application value = mutableStateFlow.getValue();
            Application application = value;
            MutableStateFlow<Application> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, Application.copy$default(application, false, null, null, null, null, false, null, null, null, uri, Application.copy$default(application, false, null, null, null, null, false, null, null, null, uri, false, null, null, 7679, null).gEmmrt(), null, null, 6655, null))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void EZpvd() {
        Application value;
        MutableStateFlow<Application> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Application.copy$default(value, false, null, null, null, null, false, null, null, null, null, false, null, null, 2047, null)));
    }
}
