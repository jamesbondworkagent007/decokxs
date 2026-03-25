package com.okinc.business.market.features.favorites.editing.domain.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C56403yEb;
import o.C56444yFp;
import o.InterfaceC49405unt;
import o.InterfaceC56445yFq;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ValidateMarketFavoritesGroupNameUseCase implements InterfaceC49405unt<Pair<? extends String, ? extends Set<? extends String>>, GroupNameValidationResult> {
    private static final StateListAnimator Companion = new StateListAnimator(null);

    @yCM
    public ValidateMarketFavoritesGroupNameUseCase() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* synthetic */ GroupNameValidationResult AEQbTJ(Pair<? extends String, ? extends Set<? extends String>> pair) {
        return KWHzl((Pair<String, ? extends Set<String>>) pair);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public GroupNameValidationResult KWHzl(@NotNull Pair<String, ? extends Set<String>> pair) {
        return (GroupNameValidationResult) InterfaceC49405unt.Activity.EZpvd(this, pair);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.favorites.editing.domain.group.ValidateMarketFavoritesGroupNameUseCase.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class GroupNameValidationResult {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ GroupNameValidationResult[] $VALUES;
        public static final GroupNameValidationResult VALID = new GroupNameValidationResult("VALID", 0);
        public static final GroupNameValidationResult INVALID_EMPTY = new GroupNameValidationResult("INVALID_EMPTY", 1);
        public static final GroupNameValidationResult INVALID_CHARACTER = new GroupNameValidationResult("INVALID_CHARACTER", 2);
        public static final GroupNameValidationResult INVALID_LENGTH = new GroupNameValidationResult("INVALID_LENGTH", 3);
        public static final GroupNameValidationResult INVALID_SPACE_ONLY = new GroupNameValidationResult("INVALID_SPACE_ONLY", 4);
        public static final GroupNameValidationResult DUPLICATE_NAME = new GroupNameValidationResult("DUPLICATE_NAME", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ GroupNameValidationResult[] $values() {
            return new GroupNameValidationResult[]{VALID, INVALID_EMPTY, INVALID_CHARACTER, INVALID_LENGTH, INVALID_SPACE_ONLY, DUPLICATE_NAME};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<GroupNameValidationResult> getEntries() {
            return $ENTRIES;
        }

        private GroupNameValidationResult(String str, int i) {
        }

        static {
            GroupNameValidationResult[] groupNameValidationResultArr$values = $values();
            $VALUES = groupNameValidationResultArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(groupNameValidationResultArr$values);
        }

        public static GroupNameValidationResult valueOf(String str) {
            return (GroupNameValidationResult) Enum.valueOf(GroupNameValidationResult.class, str);
        }

        public static GroupNameValidationResult[] values() {
            return (GroupNameValidationResult[]) $VALUES.clone();
        }
    }

    public GroupNameValidationResult KWHzl(@NotNull Pair<String, ? extends Set<String>> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return OLrzqt(pair.component1(), pair.component2());
    }

    public final GroupNameValidationResult OLrzqt(String str, Set<String> set) {
        if (str.length() == 0) {
            return GroupNameValidationResult.INVALID_EMPTY;
        }
        if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return GroupNameValidationResult.INVALID_SPACE_ONLY;
        }
        if (!new Regex("^[\\p{L}\\p{N}_\\-\\s]+$").matches(str)) {
            return GroupNameValidationResult.INVALID_CHARACTER;
        }
        if (str.length() > 26) {
            return GroupNameValidationResult.INVALID_LENGTH;
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.getType(str.charAt(i)) == 19) {
                return GroupNameValidationResult.INVALID_CHARACTER;
            }
        }
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            arrayList.add(lowerCase);
        }
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        if (arrayList.contains(lowerCase2)) {
            return GroupNameValidationResult.DUPLICATE_NAME;
        }
        return GroupNameValidationResult.VALID;
    }
}
