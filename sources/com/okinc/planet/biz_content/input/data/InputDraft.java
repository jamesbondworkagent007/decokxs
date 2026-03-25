package com.okinc.planet.biz_content.input.data;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InputDraft implements Serializable {
    public static final int $stable = 8;
    private final InputDraftContent content;
    private final InputDraftMetadata metadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputDraft copy$default(InputDraft inputDraft, InputDraftMetadata inputDraftMetadata, InputDraftContent inputDraftContent, int i, Object obj) {
        if ((i & 1) != 0) {
            inputDraftMetadata = inputDraft.metadata;
        }
        if ((i & 2) != 0) {
            inputDraftContent = inputDraft.content;
        }
        return inputDraft.copy(inputDraftMetadata, inputDraftContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDraftMetadata component1() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDraftContent component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDraft copy(@NotNull InputDraftMetadata inputDraftMetadata, @NotNull InputDraftContent inputDraftContent) {
        Intrinsics.checkNotNullParameter(inputDraftMetadata, "");
        Intrinsics.checkNotNullParameter(inputDraftContent, "");
        return new InputDraft(inputDraftMetadata, inputDraftContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputDraft)) {
            return false;
        }
        InputDraft inputDraft = (InputDraft) obj;
        return Intrinsics.EZpvd(this.metadata, inputDraft.metadata) && Intrinsics.EZpvd(this.content, inputDraft.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDraftContent getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDraftMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.metadata.hashCode() * 31) + this.content.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputDraft(metadata=" + this.metadata + ", content=" + this.content + ")";
    }

    public InputDraft(@NotNull InputDraftMetadata inputDraftMetadata, @NotNull InputDraftContent inputDraftContent) {
        Intrinsics.checkNotNullParameter(inputDraftMetadata, "");
        Intrinsics.checkNotNullParameter(inputDraftContent, "");
        this.metadata = inputDraftMetadata;
        this.content = inputDraftContent;
    }

    public final boolean needsRestore() {
        return !this.metadata.isRestored() && (StringsKt__StringsKt.fARcdN((CharSequence) this.content.getTextState().getPlainText()) ^ true);
    }

    public final InputDraft markAsRestored() {
        InputDraftMetadata inputDraftMetadata = this.metadata;
        return copy$default(this, inputDraftMetadata.copy((79 & 1) != 0 ? inputDraftMetadata.id : null, (79 & 2) != 0 ? inputDraftMetadata.type : null, (79 & 4) != 0 ? inputDraftMetadata.title : null, (79 & 8) != 0 ? inputDraftMetadata.createdAt : 0L, (79 & 16) != 0 ? inputDraftMetadata.updatedAt : System.currentTimeMillis(), (79 & 32) != 0 ? inputDraftMetadata.isRestored : true, (79 & 64) != 0 ? inputDraftMetadata.version : 0), null, 2, null);
    }

    public final InputDraft updateContent(@NotNull InputDraftContent inputDraftContent) {
        Intrinsics.checkNotNullParameter(inputDraftContent, "");
        InputDraftMetadata inputDraftMetadata = this.metadata;
        return copy(inputDraftMetadata.copy((79 & 1) != 0 ? inputDraftMetadata.id : null, (79 & 2) != 0 ? inputDraftMetadata.type : null, (79 & 4) != 0 ? inputDraftMetadata.title : null, (79 & 8) != 0 ? inputDraftMetadata.createdAt : 0L, (79 & 16) != 0 ? inputDraftMetadata.updatedAt : System.currentTimeMillis(), (79 & 32) != 0 ? inputDraftMetadata.isRestored : false, (79 & 64) != 0 ? inputDraftMetadata.version : this.metadata.getVersion() + 1), inputDraftContent);
    }

    public final boolean isEmpty() {
        return StringsKt__StringsKt.fARcdN((CharSequence) this.content.getTextState().getPlainText()) && this.content.getImageItems().isEmpty();
    }
}
