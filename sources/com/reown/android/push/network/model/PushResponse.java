package com.reown.android.push.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class PushResponse {
    public final List<Error> errors;
    public final List<Field> fields;
    public final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.push.network.model.PushResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PushResponse copy$default(PushResponse pushResponse, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pushResponse.errors;
        }
        if ((i & 2) != 0) {
            list2 = pushResponse.fields;
        }
        if ((i & 4) != 0) {
            str = pushResponse.status;
        }
        return pushResponse.copy(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Error> component1() {
        return this.errors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Field> component2() {
        return this.fields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PushResponse copy(@Json(name = "errors") List<Error> list, @Json(name = "fields") List<Field> list2, @Json(name = "status") @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PushResponse(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushResponse)) {
            return false;
        }
        PushResponse pushResponse = (PushResponse) obj;
        return Intrinsics.EZpvd(this.errors, pushResponse.errors) && Intrinsics.EZpvd(this.fields, pushResponse.fields) && Intrinsics.EZpvd((Object) this.status, (Object) pushResponse.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Error> getErrors() {
        return this.errors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Field> getFields() {
        return this.fields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Error> list = this.errors;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<Field> list2 = this.fields;
        return (((iHashCode * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PushResponse(errors=" + this.errors + ", fields=" + this.fields + ", status=" + this.status + ")";
    }

    public PushResponse(@Json(name = "errors") List<Error> list, @Json(name = "fields") List<Field> list2, @Json(name = "status") @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errors = list;
        this.fields = list2;
        this.status = str;
    }

    /* JADX INFO: loaded from: classes24.dex */
    @JsonClass(generateAdapter = true)
    public static final class Error {
        public final String message;
        public final String name;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                str2 = error.name;
            }
            return error.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(@Json(name = "message") @NotNull String str, @Json(name = "name") @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Error(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.EZpvd((Object) this.message, (Object) error.message) && Intrinsics.EZpvd((Object) this.name, (Object) error.name);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.message.hashCode() * 31) + this.name.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Error(message=" + this.message + ", name=" + this.name + ")";
        }

        public Error(@Json(name = "message") @NotNull String str, @Json(name = "name") @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.message = str;
            this.name = str2;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    @JsonClass(generateAdapter = true)
    public static final class Field {
        public final String description;
        public final String field;
        public final String location;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Field copy$default(Field field, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = field.description;
            }
            if ((i & 2) != 0) {
                str2 = field.field;
            }
            if ((i & 4) != 0) {
                str3 = field.location;
            }
            return field.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.field;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.location;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Field copy(@Json(name = "description") @NotNull String str, @Json(name = "field") @NotNull String str2, @Json(name = "location") @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Field(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.EZpvd((Object) this.description, (Object) field.description) && Intrinsics.EZpvd((Object) this.field, (Object) field.field) && Intrinsics.EZpvd((Object) this.location, (Object) field.location);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescription() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getField() {
            return this.field;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLocation() {
            return this.location;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.description.hashCode() * 31) + this.field.hashCode()) * 31) + this.location.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Field(description=" + this.description + ", field=" + this.field + ", location=" + this.location + ")";
        }

        public Field(@Json(name = "description") @NotNull String str, @Json(name = "field") @NotNull String str2, @Json(name = "location") @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.description = str;
            this.field = str2;
            this.location = str3;
        }
    }
}
