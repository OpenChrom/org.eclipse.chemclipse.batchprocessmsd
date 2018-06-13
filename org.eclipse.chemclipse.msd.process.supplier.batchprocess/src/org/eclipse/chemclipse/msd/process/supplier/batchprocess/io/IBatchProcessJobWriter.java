/*******************************************************************************
 * Copyright (c) 2010, 2018 Lablicate GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Dr. Philip Wenig - initial API and implementation
 *******************************************************************************/
package org.eclipse.chemclipse.msd.process.supplier.batchprocess.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.stream.XMLStreamException;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.chemclipse.converter.exceptions.FileIsNotWriteableException;
import org.eclipse.chemclipse.msd.process.supplier.batchprocess.model.IBatchProcessJob;

/**
 * @author Dr. Philip Wenig
 * 
 */
public interface IBatchProcessJobWriter {

	void writeBatchProcessJob(File file, IBatchProcessJob batchProcessJob, IProgressMonitor monitor) throws FileNotFoundException, FileIsNotWriteableException, IOException, XMLStreamException;
}
