package umlMM.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createUmlMM1Group());
	}

	/**
	 * Creates "umlMM" palette tool group
	 * @generated
	 */
	private PaletteContainer createUmlMM1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				umlMM.diagram.part.Messages.UmlMM1Group_title);
		paletteContainer.setId("createUmlMM1Group"); //$NON-NLS-1$
		paletteContainer.add(createAssociaton1CreationTool());
		paletteContainer.add(createClass2CreationTool());
		paletteContainer.add(createDatatype3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociaton1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				umlMM.diagram.part.Messages.Associaton1CreationTool_title,
				umlMM.diagram.part.Messages.Associaton1CreationTool_desc,
				Collections
						.singletonList(umlMM.diagram.providers.UMLElementTypes.Datatype_2001));
		entry.setId("createAssociaton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(umlMM.diagram.providers.UMLElementTypes
				.getImageDescriptor(umlMM.diagram.providers.UMLElementTypes.Datatype_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass2CreationTool() {
		ToolEntry entry = new ToolEntry(
				umlMM.diagram.part.Messages.Class2CreationTool_title,
				umlMM.diagram.part.Messages.Class2CreationTool_desc, null, null) {
		};
		entry.setId("createClass2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatatype3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				umlMM.diagram.part.Messages.Datatype3CreationTool_title,
				umlMM.diagram.part.Messages.Datatype3CreationTool_desc,
				Collections
						.singletonList(umlMM.diagram.providers.UMLElementTypes.Class_2002));
		entry.setId("createDatatype3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(umlMM.diagram.providers.UMLElementTypes
				.getImageDescriptor(umlMM.diagram.providers.UMLElementTypes.Class_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
