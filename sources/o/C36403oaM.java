package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.im.imui.inputpanelV2.mention.MentionInputHandler$handleAtInput$1;
import com.okinc.okimcore.model.im.MentionedUserInfo;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C36441oay;
import o.sDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oaM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36403oaM implements android.text.TextWatcher, C36441oay.Activity {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public java.util.List<C36407oaQ> AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public final java.lang.String AkhnZx;
    public final java.util.List<C36410oaT> DbNXlk;
    public final boolean KWHzl;
    public final android.widget.EditText OLrzqt;
    public final android.content.Context copydefault;
    public final java.util.HashSet<java.lang.String> djBIcL;
    public C35285nsT fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.util.List<C36407oaQ> isConnected;
    public final InterfaceC36409oaS valueOf;
    public final java.util.List<C36410oaT> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(C35285nsT c35285nsT) {
        this.fetchVPNInfo = c35285nsT;
    }

    public C36403oaM(@NotNull android.content.Context context, @NotNull android.widget.EditText editText, @NotNull java.lang.String str, InterfaceC36409oaS interfaceC36409oaS, ActivityResultLauncher<android.content.Intent> activityResultLauncher, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = context;
        this.OLrzqt = editText;
        this.AkhnZx = str;
        this.valueOf = interfaceC36409oaS;
        this.AhwBna = activityResultLauncher;
        this.KWHzl = z;
        this.DbNXlk = new java.util.ArrayList();
        this.values = new java.util.ArrayList();
        this.djBIcL = new java.util.HashSet<>();
        this.gEmmrt = "";
        this.AYXKKw = yDY.AhwBna();
        pUU.KWHzl("MentionInputHandler", "init: targetId=" + str);
        editText.addTextChangedListener(this);
        gEmmrt().copydefault(this);
        C36404oaN.EZpvd.AEQbTJ(editText, this);
    }

    public final oDB EZpvd() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).zuWLRA();
    }

    public final oEG OLrzqt() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).DXXBbs();
    }

    public final C36441oay gEmmrt() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).QHmsKR();
    }

    /* JADX INFO: renamed from: o.oaM$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((C36407oaQ) t).EZpvd()), java.lang.Integer.valueOf(((C36407oaQ) t2).EZpvd()));
        }
    }

    /* JADX INFO: renamed from: o.oaM$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oaM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault() {
        pUU.KWHzl("MentionInputHandler", "detach");
        C36404oaN.EZpvd.AEQbTJ(this.OLrzqt);
        gEmmrt().EZpvd(this);
        this.OLrzqt.removeTextChangedListener(this);
        this.DbNXlk.clear();
        this.values.clear();
    }

    public final void KWHzl(@NotNull java.util.List<C36407oaQ> list) {
        java.lang.Integer numValueOf;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        pUU.KWHzl("MentionInputHandler", "setMentionBlocks: count=" + list.size());
        java.util.Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            numValueOf = java.lang.Integer.valueOf(((C36407oaQ) it.next()).KWHzl());
            while (it.hasNext()) {
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((C36407oaQ) it.next()).KWHzl());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int length = this.OLrzqt.length();
        if (length >= iIntValue) {
            pUU.KWHzl("MentionInputHandler", "setMentionBlocks: Text is ready, applying immediately. Current len=" + length + ", required=" + iIntValue);
            OLrzqt(list);
            this.isConnected = null;
            return;
        }
        pUU.KWHzl("MentionInputHandler", "setMentionBlocks: Deferring application. Current len=" + length + ", required=" + iIntValue);
        this.isConnected = list;
    }

    public final void OLrzqt(java.util.List<C36407oaQ> list) {
        pUU.EZpvd("MentionInputHandler", "restoreDraftMentions: [STAGE 1/5] Starting restoration. blocks.size=" + list.size());
        this.AEQbTJ = true;
        android.text.Editable text = this.OLrzqt.getText();
        int length = text.length();
        pUU.EZpvd("MentionInputHandler", "restoreDraftMentions: [STAGE 2/5] EditText state captured. textLength=" + length);
        C36410oaT[] c36410oaTArr = (C36410oaT[]) text.getSpans(0, length, C36410oaT.class);
        java.util.Iterator itEZpvd = yHX.EZpvd(c36410oaTArr);
        while (itEZpvd.hasNext()) {
            text.removeSpan((C36410oaT) itEZpvd.next());
        }
        pUU.EZpvd("MentionInputHandler", "restoreDraftMentions: [STAGE 3/5] Cleared " + c36410oaTArr.length + " existing spans");
        pUU.EZpvd("MentionInputHandler", "restoreDraftMentions: [STAGE 4/5] Validating and applying spans");
        int i = 0;
        int i2 = 0;
        for (C36407oaQ c36407oaQ : list) {
            Intrinsics.copydefault(text);
            if (AEQbTJ(c36407oaQ, text, length)) {
                text.setSpan(new C36410oaT(c36407oaQ.copydefault(), c36407oaQ.AEQbTJ(), c36407oaQ.OLrzqt(), false), c36407oaQ.EZpvd(), c36407oaQ.KWHzl(), 33);
                i++;
                pUU.EZpvd("MentionInputHandler", "restoreDraftMentions: applied span for '" + c36407oaQ.AEQbTJ() + "' at [" + c36407oaQ.EZpvd() + ", " + c36407oaQ.KWHzl() + "]");
            } else {
                i2++;
                pUU.KWHzl("MentionInputHandler", "restoreDraftMentions: FAILED to restore mention '" + c36407oaQ.AEQbTJ() + "' at [" + c36407oaQ.EZpvd() + ", " + c36407oaQ.KWHzl() + "]");
            }
        }
        this.AEQbTJ = false;
        djBIcL();
        AYXKKw();
        pUU.EZpvd("MentionInputHandler", "restoreDraftMentions: [STAGE 5/5] Restoration complete. restored=" + i + ", failed=" + i2 + ", total=" + list.size());
    }

    public final boolean AEQbTJ(C36407oaQ c36407oaQ, android.text.Editable editable, int i) {
        pUU.EZpvd("MentionInputHandler", "isValidMentionBlock: validating block [" + c36407oaQ.EZpvd() + ", " + c36407oaQ.KWHzl() + "] name=" + c36407oaQ.AEQbTJ());
        if (c36407oaQ.EZpvd() < 0 || c36407oaQ.KWHzl() > i || c36407oaQ.EZpvd() >= c36407oaQ.KWHzl()) {
            pUU.KWHzl("MentionInputHandler", "isValidMentionBlock: INVALID block range - start=" + c36407oaQ.EZpvd() + ", end=" + c36407oaQ.KWHzl() + ", textLen=" + i + ", name=" + c36407oaQ.AEQbTJ());
            return false;
        }
        java.lang.String string = editable.subSequence(c36407oaQ.EZpvd(), c36407oaQ.KWHzl()).toString();
        if (!StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) string, '@', false, 2, (java.lang.Object) null)) {
            pUU.KWHzl("MentionInputHandler", "isValidMentionBlock: MISMATCH at position - expected prefix='@', found='" + string + "', name=" + c36407oaQ.AEQbTJ());
            return false;
        }
        pUU.EZpvd("MentionInputHandler", "isValidMentionBlock: block is valid - name=" + c36407oaQ.AEQbTJ());
        return true;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (this.AEQbTJ) {
            return;
        }
        this.DbNXlk.clear();
        if (i2 <= 0 || i3 != 0) {
            return;
        }
        java.util.Iterator itEZpvd = yHX.EZpvd((C36410oaT[]) this.OLrzqt.getText().getSpans(i, i2 + i, C36410oaT.class));
        while (itEZpvd.hasNext()) {
            C36410oaT c36410oaT = (C36410oaT) itEZpvd.next();
            pUU.EZpvd("MentionInputHandler", "beforeTextChanged: marking span for deletion: " + c36410oaT.copydefault());
            java.util.List<C36410oaT> list = this.DbNXlk;
            Intrinsics.copydefault(c36410oaT);
            list.add(c36410oaT);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (this.AEQbTJ) {
            return;
        }
        if (i3 == 1 && charSequence != null && charSequence.length() > 0 && i < charSequence.length() && charSequence.charAt(i) == '@') {
            KWHzl(charSequence, i);
        }
        if (i3 > 0) {
            java.util.Iterator itEZpvd = yHX.EZpvd((C36410oaT[]) this.OLrzqt.getText().getSpans(i, i3 + i, C36410oaT.class));
            while (itEZpvd.hasNext()) {
                C36410oaT c36410oaT = (C36410oaT) itEZpvd.next();
                int spanStart = this.OLrzqt.getText().getSpanStart(c36410oaT);
                int spanEnd = this.OLrzqt.getText().getSpanEnd(c36410oaT);
                if (spanStart != -1 && spanEnd != -1 && !this.values.contains(c36410oaT)) {
                    pUU.EZpvd("MentionInputHandler", "onTextChanged: detected edit inside mention '" + c36410oaT.copydefault() + "' - marking for invalidation");
                    java.util.List<C36410oaT> list = this.values;
                    Intrinsics.copydefault(c36410oaT);
                    list.add(c36410oaT);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.Integer numValueOf;
        if (this.AEQbTJ) {
            return;
        }
        if (!this.DbNXlk.isEmpty()) {
            pUU.EZpvd("MentionInputHandler", "afterTextChanged: deleting " + this.DbNXlk.size() + " spans");
            this.AEQbTJ = true;
            for (C36410oaT c36410oaT : this.DbNXlk) {
                int spanStart = this.OLrzqt.getText().getSpanStart(c36410oaT);
                int spanEnd = this.OLrzqt.getText().getSpanEnd(c36410oaT);
                if (spanStart != -1 && spanEnd != -1) {
                    this.OLrzqt.getText().delete(spanStart, spanEnd);
                    this.OLrzqt.getText().removeSpan(c36410oaT);
                }
            }
            this.DbNXlk.clear();
            this.AEQbTJ = false;
            AYXKKw();
        }
        if (!this.values.isEmpty()) {
            pUU.EZpvd("MentionInputHandler", "afterTextChanged: invalidating " + this.values.size() + " edited mentions");
            for (C36410oaT c36410oaT2 : this.values) {
                this.OLrzqt.getText().removeSpan(c36410oaT2);
                pUU.KWHzl("MentionInputHandler", "afterTextChanged: removed mention status from '" + c36410oaT2.copydefault() + "'");
            }
            this.values.clear();
            AYXKKw();
        }
        java.util.List<C36407oaQ> list = this.isConnected;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                numValueOf = java.lang.Integer.valueOf(((C36407oaQ) it.next()).KWHzl());
                while (it.hasNext()) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((C36407oaQ) it.next()).KWHzl());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
            } else {
                numValueOf = null;
            }
            if ((editable != null ? editable.length() : 0) >= (numValueOf != null ? numValueOf.intValue() : 0)) {
                pUU.KWHzl("MentionInputHandler", "afterTextChanged: Applying deferred blocks");
                OLrzqt(list);
                this.isConnected = null;
            }
        }
        djBIcL();
    }

    public final void djBIcL() {
        java.lang.String string = this.OLrzqt.getText().toString();
        if (string.length() > 0) {
            this.gEmmrt = string;
            this.AYXKKw = KWHzl();
        }
    }

    public final void KWHzl(java.lang.CharSequence charSequence, int i) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        boolean z = i == 0;
        boolean z2 = charSequence.length() == 1;
        boolean z3 = i > 0 && CharsKt__CharJVMKt.EZpvd(charSequence.charAt(i + (-1)));
        boolean z4 = i > 0 && !java.lang.Character.isLetterOrDigit(charSequence.charAt(i - 1));
        if ((!z && !z2 && !z3 && !z4) || (lifecycleOwner = ViewTreeLifecycleOwner.get(this.OLrzqt)) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new MentionInputHandler$handleAtInput$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        java.lang.String strEZpvd = C44157sFk.EZpvd(groupMemberInfo);
        java.lang.String nickName = groupMemberInfo.getNickName();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) nickName)) {
            nickName = C44170sFx.copydefault(groupMemberInfo);
        }
        pUU.KWHzl("MentionInputHandler", "addMention: displayName: " + strEZpvd + " | sendName: " + nickName);
        OfficialTagInfo officialTags = groupMemberInfo.getOfficialTags();
        if (officialTags != null && C44170sFx.OLrzqt(officialTags)) {
            this.djBIcL.add(groupMemberInfo.getMemberId());
        }
        java.lang.String memberId = groupMemberInfo.getMemberId();
        OfficialTagInfo officialTags2 = groupMemberInfo.getOfficialTags();
        KWHzl(memberId, strEZpvd, nickName, officialTags2 != null && C44170sFx.OLrzqt(officialTags2));
    }

    public final void AEQbTJ() {
        pUU.EZpvd("MentionInputHandler", "addMentionAll");
        KWHzl(MultiTransferSignData.DEFAULT_INTERVAL, C33070mpX.AYXKKw(sDX.StateListAnimator.AkhnZx), "all", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        int i;
        if (java.lang.Math.max(str3.length(), str2.length()) + this.OLrzqt.length() + 1 >= 2000) {
            pUU.KWHzl("MentionInputHandler", "insertMention: Character limit exceeded. Max=2000");
            return;
        }
        java.lang.String strCopydefault = copydefault(str2);
        C36410oaT c36410oaT = new C36410oaT(str, str2, str3, z);
        int selectionStart = this.OLrzqt.getSelectionStart();
        if (selectionStart > 0) {
            android.text.Editable text = this.OLrzqt.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            i = selectionStart - 1;
            java.lang.Character chAhwBna = C59454zhO.AhwBna(text, i);
            if (chAhwBna == null || chAhwBna.charValue() != '@') {
                i = selectionStart;
            }
        }
        this.AEQbTJ = true;
        this.OLrzqt.getText().replace(i, selectionStart, strCopydefault);
        int length = strCopydefault.length() + i;
        this.OLrzqt.getText().setSpan(c36410oaT, i, length, 33);
        this.OLrzqt.getText().insert(length, " ");
        this.OLrzqt.setSelection(length + 1);
        this.AEQbTJ = false;
        djBIcL();
        AYXKKw();
    }

    public final java.util.List<C36407oaQ> KWHzl() {
        C36410oaT[] c36410oaTArr = (C36410oaT[]) this.OLrzqt.getText().getSpans(0, this.OLrzqt.getText().length(), C36410oaT.class);
        Intrinsics.copydefault(c36410oaTArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(c36410oaTArr.length);
        for (C36410oaT c36410oaT : c36410oaTArr) {
            arrayList.add(new C36407oaQ(c36410oaT.EZpvd(), c36410oaT.copydefault(), c36410oaT.OLrzqt(), this.OLrzqt.getText().getSpanStart(c36410oaT), this.OLrzqt.getText().getSpanEnd(c36410oaT)));
        }
        return arrayList;
    }

    public final void AYXKKw() {
        InterfaceC36409oaS interfaceC36409oaS = this.valueOf;
        if (interfaceC36409oaS != null) {
            interfaceC36409oaS.copydefault(KWHzl());
        }
    }

    @Override // o.C36441oay.Activity
    public void AEQbTJ(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.util.List<C36407oaQ> listKWHzl = KWHzl();
        OKMessageContent content = oKMessage.getContent();
        OKTextMessage oKTextMessage = content instanceof OKTextMessage ? (OKTextMessage) content : null;
        java.lang.String content2 = oKTextMessage != null ? oKTextMessage.getContent() : null;
        if (listKWHzl.isEmpty() && content2 != null && content2.length() != 0 && (Intrinsics.EZpvd((java.lang.Object) content2, (java.lang.Object) this.gEmmrt) || Intrinsics.EZpvd((java.lang.Object) content2, (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) this.gEmmrt).toString()))) {
            pUU.KWHzl("MentionInputHandler", "onPreSend: Restoring mention blocks from cache");
            listKWHzl = this.AYXKKw;
        }
        if (listKWHzl.isEmpty()) {
            return;
        }
        pUU.KWHzl("MentionInputHandler", "onPreSend: Processing " + listKWHzl.size() + " mentions");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        OKMentionedInfo.MentionedType mentionedType = OKMentionedInfo.MentionedType.NONE;
        java.util.Iterator<T> it = listKWHzl.iterator();
        OKMentionedInfo.MentionedType mentionedTypeKWHzl = mentionedType;
        while (it.hasNext()) {
            mentionedTypeKWHzl = KWHzl((C36407oaQ) it.next(), arrayList, mentionedTypeKWHzl);
        }
        if (mentionedTypeKWHzl != OKMentionedInfo.MentionedType.NONE) {
            copydefault(oKMessage, content, listKWHzl, arrayList, mentionedTypeKWHzl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OKMentionedInfo.MentionedType KWHzl(C36407oaQ c36407oaQ, java.util.List<MentionedUserInfo> list, OKMentionedInfo.MentionedType mentionedType) {
        if (Intrinsics.EZpvd((java.lang.Object) c36407oaQ.copydefault(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            return OKMentionedInfo.MentionedType.ALL;
        }
        java.lang.String strCopydefault = c36407oaQ.copydefault();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                list.add(new MentionedUserInfo(strCopydefault, "@" + c36407oaQ.OLrzqt()));
                if (mentionedType != OKMentionedInfo.MentionedType.ALL) {
                }
            } else {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((MentionedUserInfo) it.next()).getUserId(), (java.lang.Object) strCopydefault)) {
                        break;
                    }
                }
                list.add(new MentionedUserInfo(strCopydefault, "@" + c36407oaQ.OLrzqt()));
                if (mentionedType != OKMentionedInfo.MentionedType.ALL) {
                    return OKMentionedInfo.MentionedType.PART;
                }
            }
        }
        return mentionedType;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(OKMessage oKMessage, OKMessageContent oKMessageContent, java.util.List<C36407oaQ> list, java.util.List<MentionedUserInfo> list2, OKMentionedInfo.MentionedType mentionedType) {
        OKTextMessage oKTextMessage;
        OKMessageContent content = oKMessage.getContent();
        if (content instanceof OKTextMessage) {
            oKTextMessage = (OKTextMessage) content;
        } else if (content instanceof OKReferenceMessage) {
            OKMessageContent originalOKMessageContent = ((OKReferenceMessage) content).getOriginalOKMessageContent();
            oKTextMessage = originalOKMessageContent instanceof OKTextMessage ? (OKTextMessage) originalOKMessageContent : null;
        }
        if (oKTextMessage != null) {
            java.lang.String strOLrzqt = OLrzqt(oKTextMessage, list);
            if (oKMessageContent != null) {
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
                oKMessageContent.setMentionedInfo(new OKMentionedInfo(mentionedType, list2, strOLrzqt));
            }
            oKMessage.setContent(oKMessageContent);
        }
    }

    public final java.lang.String OLrzqt(OKTextMessage oKTextMessage, java.util.List<C36407oaQ> list) {
        int iMin;
        java.lang.String content = oKTextMessage.getContent();
        if (content == null || content.length() == 0 || list == null || list.isEmpty()) {
            return content;
        }
        java.util.List<C36407oaQ> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new ActionBar());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iKWHzl = 0;
        for (C36407oaQ c36407oaQ : listEZpvd) {
            if (c36407oaQ.EZpvd() > iKWHzl && (iMin = java.lang.Math.min(c36407oaQ.EZpvd(), content.length())) > iKWHzl) {
                java.lang.String strSubstring = content.substring(iKWHzl, iMin);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                sb.append(strSubstring);
                sb2.append(strSubstring);
            }
            sb.append('@');
            sb.append(c36407oaQ.OLrzqt());
            sb2.append('@');
            iKWHzl = c36407oaQ.KWHzl();
        }
        if (iKWHzl < content.length()) {
            java.lang.String strSubstring2 = content.substring(iKWHzl);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            sb.append(strSubstring2);
            sb2.append(strSubstring2);
        }
        oKTextMessage.setContent(sb.toString());
        java.lang.String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string).toString();
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "@" + str;
    }

    public final boolean KWHzl(@NotNull OKMessage oKMessage) {
        OKMentionedInfo mentionedInfo;
        java.util.List<MentionedUserInfo> mentionedUserList;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (oKMessage.getConversationType() != OKConversationType.GROUP) {
            return false;
        }
        OKMessageContent content = oKMessage.getContent();
        OKTextMessage oKTextMessage = content instanceof OKTextMessage ? (OKTextMessage) content : null;
        if (oKTextMessage == null || (mentionedInfo = oKTextMessage.getMentionedInfo()) == null || mentionedInfo.getType() != OKMentionedInfo.MentionedType.PART || (mentionedUserList = mentionedInfo.getMentionedUserList()) == null || mentionedUserList.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = mentionedUserList.iterator();
        while (it.hasNext()) {
            if (this.djBIcL.contains(((MentionedUserInfo) it.next()).getUserId())) {
                return true;
            }
        }
        return false;
    }
}
