package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.planet.biz_content.input.data.InputDraft;
import com.okinc.planet.biz_content.input.data.InputDraftMetadata;
import com.okinc.planet.biz_content.input.data.InputDraftType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC47552tsK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tsL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47553tsL implements InterfaceC47550tsI {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<java.util.Map<java.lang.String, InputDraft>> AEQbTJ;
    public final Flow<java.util.Map<java.lang.String, InputDraft>> EZpvd;
    public final SavedStateHandle OLrzqt;

    public C47553tsL(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = savedStateHandle;
        MutableStateFlow<java.util.Map<java.lang.String, InputDraft>> MutableStateFlow = StateFlowKt.MutableStateFlow(C56424yEw.KWHzl());
        this.AEQbTJ = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
        AEQbTJ();
        pUU.EZpvd("DraftRepository", "DraftRepository initialized - Instance: " + hashCode());
        pUU.EZpvd("DraftRepository", "SavedStateHandle instance: " + savedStateHandle.hashCode());
    }

    /* JADX INFO: renamed from: o.tsL$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tsL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AEQbTJ() {
        try {
            java.util.Map<java.lang.String, InputDraft> mapKWHzl = (java.util.Map) this.OLrzqt.get("drafts_storage");
            if (mapKWHzl == null) {
                mapKWHzl = C56424yEw.KWHzl();
            }
            this.AEQbTJ.setValue(mapKWHzl);
            pUU.EZpvd("DraftRepository", "Loaded " + mapKWHzl.size() + " drafts from saved state");
        } catch (java.lang.Exception e) {
            pUU.copydefault("DraftRepository", "Failed to load drafts from saved state: " + e);
            this.AEQbTJ.setValue(C56424yEw.KWHzl());
        }
    }

    public final void EZpvd() {
        try {
            this.OLrzqt.set("drafts_storage", this.AEQbTJ.getValue());
            pUU.EZpvd("DraftRepository", "Saved " + this.AEQbTJ.getValue().size() + " drafts to saved state");
        } catch (java.lang.Exception e) {
            pUU.copydefault("DraftRepository", "Failed to save drafts to saved state: " + e);
        }
    }

    @Override // o.InterfaceC47550tsI
    public java.lang.Object OLrzqt(@NotNull InputDraft inputDraft, @NotNull Continuation<? super AbstractC47552tsK<InputDraft>> continuation) {
        try {
            java.util.Map<java.lang.String, InputDraft> mapIsConnected = C56424yEw.isConnected(this.AEQbTJ.getValue());
            mapIsConnected.put(inputDraft.getMetadata().getId(), inputDraft);
            this.AEQbTJ.setValue(mapIsConnected);
            EZpvd();
            if (inputDraft.getMetadata().getType() == InputDraftType.AUTO_SAVE) {
                this.OLrzqt.set("auto_save_draft_storage_key", inputDraft);
                pUU.EZpvd("DraftRepository", "Auto-save draft saved to dedicated key: auto_save_draft_storage_key");
            }
            pUU.EZpvd("DraftRepository", "Draft saved successfully: " + inputDraft.getMetadata().getId() + " to SavedStateHandle: " + this.OLrzqt.hashCode());
            return new AbstractC47552tsK.StateListAnimator(inputDraft);
        } catch (java.lang.Exception e) {
            java.lang.String str = "Failed to save draft: " + inputDraft.getMetadata().getId();
            pUU.copydefault("DraftRepository", str + " - " + e);
            return new AbstractC47552tsK.Activity(e, str);
        }
    }

    @Override // o.InterfaceC47550tsI
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC47552tsK<InputDraft>> continuation) {
        try {
            InputDraft inputDraft = this.AEQbTJ.getValue().get(str);
            pUU.EZpvd("DraftRepository", "Retrieved draft: " + str + ", found: " + (inputDraft != null));
            return new AbstractC47552tsK.StateListAnimator(inputDraft);
        } catch (java.lang.Exception e) {
            java.lang.String str2 = "Failed to get draft: " + str;
            pUU.copydefault("DraftRepository", str2 + " - " + e);
            return new AbstractC47552tsK.Activity(e, str2);
        }
    }

    @Override // o.InterfaceC47550tsI
    public java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC47552tsK<java.lang.Boolean>> continuation) {
        try {
            this.AEQbTJ.setValue(C56424yEw.KWHzl());
            this.OLrzqt.remove("drafts_storage");
            this.OLrzqt.remove("auto_save_draft_storage_key");
            pUU.EZpvd("DraftRepository", "All drafts cleared");
            return new AbstractC47552tsK.StateListAnimator(C56443yFo.KWHzl(true));
        } catch (java.lang.Exception e) {
            pUU.copydefault("DraftRepository", "Failed to clear all drafts - " + e);
            return new AbstractC47552tsK.Activity(e, "Failed to clear all drafts");
        }
    }

    @Override // o.InterfaceC47550tsI
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC47552tsK<InputDraft>> continuation) {
        java.lang.Object next;
        InputDraftMetadata metadata;
        try {
            InputDraft inputDraft = (InputDraft) this.OLrzqt.get("auto_save_draft_storage_key");
            pUU.EZpvd("DraftRepository", "Checking auto-save draft from SavedStateHandle: " + this.OLrzqt.hashCode());
            pUU.EZpvd("DraftRepository", "Auto-save draft from dedicated key: " + (inputDraft != null ? "Found" : "NULL"));
            if (inputDraft != null && inputDraft.getMetadata().getType() == InputDraftType.AUTO_SAVE) {
                pUU.EZpvd("DraftRepository", "Retrieved latest auto-save draft from dedicated key: " + inputDraft.getMetadata().getId());
                return new AbstractC47552tsK.StateListAnimator(inputDraft);
            }
            java.util.Collection<InputDraft> collectionValues = this.AEQbTJ.getValue().values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : collectionValues) {
                if (((InputDraft) obj).getMetadata().getType() == InputDraftType.AUTO_SAVE) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            java.lang.String id = null;
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long updatedAt = ((InputDraft) next).getMetadata().getUpdatedAt();
                    do {
                        java.lang.Object next2 = it.next();
                        long updatedAt2 = ((InputDraft) next2).getMetadata().getUpdatedAt();
                        if (updatedAt < updatedAt2) {
                            next = next2;
                            updatedAt = updatedAt2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InputDraft inputDraft2 = (InputDraft) next;
            if (inputDraft2 != null && (metadata = inputDraft2.getMetadata()) != null) {
                id = metadata.getId();
            }
            pUU.EZpvd("DraftRepository", "Retrieved latest auto-save draft: " + id);
            return new AbstractC47552tsK.StateListAnimator(inputDraft2);
        } catch (java.lang.Exception e) {
            pUU.copydefault("DraftRepository", "Failed to get latest auto-save draft - " + e);
            return new AbstractC47552tsK.Activity(e, "Failed to get latest auto-save draft");
        }
    }
}
