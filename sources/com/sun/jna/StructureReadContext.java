package com.sun.jna;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes12.dex */
public class StructureReadContext extends FromNativeContext {
    private Field field;
    private Structure structure;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Field getField() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Structure getStructure() {
        return this.structure;
    }

    public StructureReadContext(Structure structure, Field field) {
        super(field.getType());
        this.structure = structure;
        this.field = field;
    }
}
